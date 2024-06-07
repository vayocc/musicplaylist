package com.cc.musicplaylist;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.cc.musicplaylist.dto.music163.Music163PlaylistDetail;
import com.cc.musicplaylist.dto.spotify.CreatePlaylistRequest;
import com.cc.musicplaylist.dto.spotify.CreatePlaylistResponse;
import com.cc.musicplaylist.dto.spotify.SpotifyGetCurrentUserPlaylistsResponse;
import com.cc.musicplaylist.dto.spotify.SpotifyTrackQuery;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.google.gson.*;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.Cookie;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitUntilState;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class PlaywrightConnectOverCdpTest {

    private static final Logger log = LoggerFactory.getLogger(PlaywrightConnectOverCdpTest.class);
    //在本类中的所有测试之间共享。  Shared between all tests in this class.
    static Playwright playwright;
    static Browser browser;

    // 每个测试方法的新实例。 New instance for each test method.
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launchBrowser() {
        // ex();
        playwright = Playwright.create();
        browser = playwright.chromium().connectOverCDP("http://localhost:" + getPort() + "/",
                new BrowserType.ConnectOverCDPOptions().setSlowMo(100)
        );
    }


    @BeforeEach
    void createContextAndPage() {
        context = browser.contexts().getFirst(); // browser.newContext();
        // page = context.newPage();
    }


    @Test
    void getMusic163ByRPA() throws Exception, JsonProcessingException {


        //  final String[] authorization = new String[1];
        CompletableFuture<String> authorizationFuture = new CompletableFuture<>();
        Page spotifyPage = context.newPage();

        // 设置拦截网络请求的路由
        context.route("https://api-partner.spotify.com/**", route -> {
            com.microsoft.playwright.Request request = route.request();
            // 检查是否是目标URL
            if (request.url().contains("https://api-partner.spotify.com/pathfinder/v1/query")) {
                String authorizationHeader = request.headerValue("Authorization");
                if (authorizationHeader != null) {
                    log.info("Authorization Header: " + authorizationHeader);
                }
                authorizationFuture.complete(authorizationHeader);
            }
            route.resume();
        });

        spotifyPage.navigate("https://open.spotify.com/", new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));

        String authorization = authorizationFuture.get();
        String spotifyMeId = getSpotifyMeInfo(authorization);


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Music163PlaylistDetail> music163PlaylistDetailList = new ArrayList<>();

        Page page2 = context.newPage();
        page2.onResponse(response -> {
            if (response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200) {
                String retBody = response.text();
                // log.info("music163结果:" + "完成");
                Music163PlaylistDetail music163PlaylistDetail = null;
                try {
                    music163PlaylistDetail = objectMapper.readValue(retBody, Music163PlaylistDetail.class);
                    music163PlaylistDetailList.add(music163PlaylistDetail);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        // 找到所有的我创建的歌单，
        page2.navigate("https://music.163.com/#/my", new Page.NavigateOptions().setWaitUntil(WaitUntilState.LOAD));
        page2.waitForLoadState(LoadState.NETWORKIDLE);
        List<Locator> playlistLocators = page2.frameLocator("iframe[name=\"contentFrame\"]").locator(".n-minelst.n-minelst-1:first-of-type .j-flag.f-cb .j-iflag").all();
        for (int i = 0; i < playlistLocators.size(); i++) {
            if (i == 0) continue;
            Locator playlistLocator = playlistLocators.get(i);
            playlistLocator.click();
            page2.waitForResponse(response -> response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200, () -> {

            });
        }
//        List<Music163PlaylistDetail> collect2 = music163PlaylistDetailList.stream()
//                .filter(item -> !CollUtil.contains(List.of(109914281L,9126199441L,8573856818L,8967948034L), item.getPlaylist().getId()))
//                .collect(Collectors.toList());
        Collections.reverse(music163PlaylistDetailList);
        for (Music163PlaylistDetail music163PlaylistDetail : music163PlaylistDetailList) {
            // 这里写调用spotify的接口
            // 检查有没有这个歌单，没有就创建
            HttpResponse spotifyPlaylist = HttpUtil.createGet("https://api.spotify.com/v1/me/playlists?limit=50").auth(authorization).execute();
            if (spotifyPlaylist.isOk()) {
                SpotifyGetCurrentUserPlaylistsResponse spotifyGetCurrentUserPlaylistsResponse = null;
                try {
                    spotifyGetCurrentUserPlaylistsResponse = objectMapper.readValue(spotifyPlaylist.body(), SpotifyGetCurrentUserPlaylistsResponse.class);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
                List<SpotifyGetCurrentUserPlaylistsResponse.ItemsBean> items = spotifyGetCurrentUserPlaylistsResponse.getItems();
                String spotifyPlayListId = createOrSelectSpotifyPlayListId(items, music163PlaylistDetail, spotifyMeId, authorization, objectMapper);
                if (Objects.isNull(spotifyPlayListId)) {
                    continue;
                }
                // 创建或者获取到id后，开始往里面添加歌曲

                List<Music163PlaylistDetail.Playlist.Tracks> tracks = music163PlaylistDetail.getPlaylist().getTracks();
                if (CollUtil.isNotEmpty(tracks)) {
                    Collections.reverse(tracks);
                    for (Music163PlaylistDetail.Playlist.Tracks track : tracks) {
                        // 歌曲名
                        String name = track.getName();
                        //  歌手
                        List<String> ar = track.getAr().stream().map(e -> e.getName()).collect(Collectors.toList());
                        // 专辑名
                        String al = track.getAl().getName();

                        HttpResponse spotifySearch = HttpUtil.createGet("https://api.spotify.com/v1/search?q=" + name + " " + ar.getFirst() + "&type=track&limit=5&locale=zh-CN")
                                .auth(authorization)
                                .execute();

                        if (spotifySearch.isOk()) {

                            SpotifyTrackQuery spotifyTrackQuery = null;
                            try {
                                spotifyTrackQuery = objectMapper.readValue(spotifySearch.body(), SpotifyTrackQuery.class);
                            } catch (JsonProcessingException e) {
                                throw new RuntimeException(e);
                            }
                            List<SpotifyTrackQuery.TracksBean.ItemsBean> items1List = spotifyTrackQuery.getTracks().getItems();
                            // 如果作者名和结果差距过大， 比如一个是日文一个是英文

                            Map<SpotifyTrackQuery.TracksBean.ItemsBean.ArtistsBeanX, Double> artistsBeanCol = items1List.stream()
                                    .flatMap(item -> item.getArtists().stream())
                                    .collect(Collectors.toMap(each -> each, i -> similarAndContainsMutual(ZhConverterUtil.toSimple(i.getName()), ar.getFirst()).doubleValue()));
                            boolean flag = false;
                            // 如果value都小于0.5
                            flag = artistsBeanCol.values().stream()
                                    .allMatch(value -> Double.compare(value, 0.5) < 0);
                            if (flag) {
                                // 重新用歌名再搜索一次
                                HttpResponse spotifySearch2 = HttpUtil.createGet("https://api.spotify.com/v1/search?q=" + name + "&type=track&limit=5&locale=zh-CN")
                                        .auth(authorization)
                                        .execute();
                                if (spotifySearch2.isOk()) {
                                    try {
                                        spotifyTrackQuery = objectMapper.readValue(spotifySearch2.body(), SpotifyTrackQuery.class);
                                        items1List = spotifyTrackQuery.getTracks().getItems();
                                    } catch (JsonProcessingException e) {
                                        throw new RuntimeException(e);
                                    }
                                }

                            }
                            if(CollUtil.isEmpty(items1List)){
                                continue;
                            }

                            // 歌名一样，并且 163的作者们里面包含有这个作者
                            SpotifyTrackQuery.TracksBean.ItemsBean itemsBean = items1List.stream().filter(
                                    e ->
                                            ObjUtil.equals(ZhConverterUtil.toSimple(e.getName()), name)
                                                    &&
                                                    e.getArtists().stream()
                                                    .peek(person -> person.setName(ZhConverterUtil.toSimple(person.getName())))
                                                    .collect(Collectors.toList()).stream()
                                                    .anyMatch(person -> CollUtil.contains(ar ,person.getName()))
                            ).findFirst().orElse(null);

                            if (Objects.isNull(itemsBean)) { //  如果没有就找专辑名相似度> 60 以上，并且是一个作者的，因为可能是作者名不一样
                                itemsBean = items1List.getFirst();
                                // 如果是live
                                 // if (StrUtil.contains(name, "Live") || StrUtil.contains(name, "live") ) {
//                                     items1List.stream()
//                                             .flatMap(item -> item.getArtists().stream())
//                                             .filter(artistsBeanX -> ObjectUtil.equals(ZhConverterUtil.toSimple(artistsBeanX.getName()), ar))
//                                             .collect(Collectors.toList());
                                     List<SpotifyTrackQuery.TracksBean.ItemsBean> collect1 = items1List.stream().filter(item ->
                                                     item.getArtists().stream().anyMatch(artistsBeanX -> ObjectUtil.equals(ZhConverterUtil.toSimple(artistsBeanX.getName()), ar.getFirst())))
                                             .collect(Collectors.toList());

                                     Map<SpotifyTrackQuery.TracksBean.ItemsBean, Double> collect = collect1.stream().collect(Collectors.toMap(each -> each, i -> similarAndContainsMutual( ZhConverterUtil.toSimple(i.getName()), name).doubleValue() + similarAndContainsMutual( ZhConverterUtil.toSimple(i.getAlbum().getName()), al).doubleValue() ));
                                     Map<SpotifyTrackQuery.TracksBean.ItemsBean, Double> itemsBeanDoubleMap = MapUtil.sortByValue(collect, true);
                                     Map.Entry<SpotifyTrackQuery.TracksBean.ItemsBean, Double> optionDoubleEntry = itemsBeanDoubleMap.entrySet().stream().findFirst().orElse(null);
                                     if (Objects.nonNull(optionDoubleEntry)) {
                                         itemsBean = optionDoubleEntry.getKey();
                                     }
                                 // }
                            }


                            HashMap<String, Object> objectObjectHashMap = MapUtil.newHashMap();
                            objectObjectHashMap.put("position", 0);
                            objectObjectHashMap.put("uris", new String[]{itemsBean.getUri()});
                            HttpUtil.createPost("https://api.spotify.com/v1/playlists/" + spotifyPlayListId + "/tracks")
                                    .body(JSONUtil.toJsonStr(objectObjectHashMap))
                                    .auth(authorization)
                                    .thenFunction((res) -> {
                                        String body = res.body();
                                        log.info(body);
                                        return null;
                                    });

                        }


                    }

                }


            }
    }
        log.info("走下来了");


        // page.pause();


    }

    private static String createOrSelectSpotifyPlayListId(List<SpotifyGetCurrentUserPlaylistsResponse.ItemsBean> items, Music163PlaylistDetail music163PlaylistDetail, String spotifyMeId, String authorization, ObjectMapper objectMapper) {
        if (CollUtil.isEmpty(items)) {
            // 没有就创建
            CreatePlaylistResponse spotifyPlayList = createSpotifyPlayList(music163PlaylistDetail, spotifyMeId, authorization, objectMapper);
            return spotifyPlayList.getId();
        } else {
            Music163PlaylistDetail finalMusic163PlaylistDetail = music163PlaylistDetail;
            SpotifyGetCurrentUserPlaylistsResponse.ItemsBean itemsBean = items.stream().filter(e -> e.getName().equals(finalMusic163PlaylistDetail.getPlaylist().getName())).findFirst().orElse(null);
            if (Objects.isNull(itemsBean)) {
                // 没有就创建
                CreatePlaylistResponse spotifyPlayList = createSpotifyPlayList(music163PlaylistDetail, spotifyMeId, authorization, objectMapper);
                return spotifyPlayList.getId();
            } else {
                // 如果有了就跳过
                // return itemsBean.getId();
                return null;
            }

        }
    }

    private static CreatePlaylistResponse createSpotifyPlayList(Music163PlaylistDetail music163PlaylistDetail, String spotifyMeId, String authorization, ObjectMapper objectMapper) {
        CreatePlaylistRequest request = new CreatePlaylistRequest();
        request.setName(music163PlaylistDetail.getPlaylist().getName());
        request.setDescription(StrUtil.subPreGbk(StrUtil.blankToDefault((String) music163PlaylistDetail.getPlaylist().getDescription(), "").replaceAll("\\r|\\n", ""), 300, false));
        request.setPublicX(false);

        HttpResponse execute = HttpUtil.createPost("https://api.spotify.com/v1/users/" + spotifyMeId + "/playlists").auth(authorization).body(new Gson().toJson(request)).execute();
        if (execute.isOk()) {
            try {
                CreatePlaylistResponse createPlaylistResponse = objectMapper.readValue(execute.body(), CreatePlaylistResponse.class);

                return createPlaylistResponse;
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }else{
            log.error("创建歌单失败",execute.body());
            throw new RuntimeException("创建歌单失败");

        }
    }

    private static String getSpotifyMeInfo(String authorization) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.spotify.com/v1/me")
                .header("Authorization", authorization)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String string = response.body().string();
            log.info("个人用户信息{}", string);
            JsonElement jsonElement = JsonParser.parseString(string);
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String id = jsonObject.get("id").getAsString();
            return id;
        }

    }


    // @Test
    void getMusic163ByOkHttp() {

        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("params", "V9LhmgO5GagNNPRbD8428ZFyxYzDM5dZXSFQVhbUTO/B8NuuJugCTAX52r2Ay8r22SpNgCp3/5SsQhvFJUfq8r7My+QTzhjrF7XdIt6fKTA/pDFeB/L4yqsSpalD1qa5bVseWlAJXYmjg0OCFQw5UQiwioo9AZu2clx+/EDNirKXQfJylBFrr6KmT4M3zY8IueHtw8A6CBJoV0kWANAml24InPPmv4JnpYurKeY9lxg=")
                .add("encSecKey", "d52c58678cf0562d5e9884a89f31b30fd5648e0b9fc56fe5ee9354c07bfc45a1b2ce9f2a4131631ea2bd81c0a10bcd219368a071876ef429211dc668697ce1cd2c9e57cea27adce0bd5520fb32f2723ac8b162d876a1d82452290aebc95d6335b9c61d3b8bc423c41af650186ba66d82c76b7acdeaf5c09ee1f6c95bd3b1deb2")
                .build();


        okhttp3.Request build = new okhttp3.Request.Builder()
                .url("https://music.163.com/weapi/v6/playlist/detail?csrf_token=59f293c0acd374ba5a97fdcd904d649e")
                .post(formBody)
                .header("accept", "*/*")
                .header("accept-language", "zh-CN,zh;q=0.9")
                .header("content-type", "application/x-www-form-urlencoded")
                .header("cookie", "NMTID=00OAltclb6CnhJ8r0GSmhzhFI7iW3YAAAGPbQ1psg; _iuqxldmzr_=32; _ntes_nnid=ac9648fca7c8b76ffdde5f854227595d,1715521547757; _ntes_nuid=ac9648fca7c8b76ffdde5f854227595d; WEVNSM=1.0.0; WNMCID=sojfkz.1715521549039.01.0; WM_TID=bg2LCEB8%2F9tFQFUAEFPF%2FjjiQKN6phvS; ntes_utid=tid._.htWwfM%252BgrN5FElEAUBfR7yniRbcv%252BLoQ._.0; sDeviceId=YD-j70ZWuOfuShBE0RFEQeA7nziQON66f8b; __snaker__id=On95CTQXCzDUOM8u; gdxidpyhxdE=xM8pbnlTc5wCuktXNNkXGEDob6ZO2axxEK3qerG4v%5Clvm8Z7C2iK%2FoTQM7dlJa%5C4a1MX6yw35Tih%2BKbdC7N7tX02eKw%2FXBcsKmgYwWCPHR3CbfI4Md%2B1lpZbde9%2FarjxeZieNj2IN0ttkdCRopk%2Fl9AAB5oKW%5CXnVkWa4nchGMjbqqwH%3A1716092186600; __csrf=59f293c0acd374ba5a97fdcd904d649e; MUSIC_U=0027A6E02A2D98D822FD7F804781982165CA1C3DB09465277672126EE8DDD52E65F33AD63F673AD5944189C8DF729EA70A4E5E5361C1D2F8D617EF37B1BF04CA236AF47D13B814973E5AFE2EBDFD94ED4045CBA40EEFBADE47194BBFB90A51167B9F49191345E048C9B40D12716008A8E45F5C18929B6250A7884189BD4D88C21ACBDA50C200FF236B9EA8EC5FF01699DE862E4520B9D22A320D4F0F0F43FF3E174E813B87DECB3F6048F7E430C274436D2E4EC853BCC83E8448D80C25E34E0B7B7787C4F8217038CEA42FF8130349A65F944D92C318D2AF57CBE3BD2676C073C024740F4B83A9268CC7DBB0989BA9C62963F1EDF0CFFCE7EB7433C5B255DA3D7D784A9853F2A8BEE501174FBFCF9E8167C5DA57ECA165F0466AA5DC8AAC283A4571D51BC296475BF943C94F89B4A30118964E9830B521223B8EF5F8766457D8979943A8A8B9361741AE24AA13571BCB99; ntes_kaola_ad=1; JSESSIONID-WYYY=qEFanj4%2FF4lvtM3%2Fqm06qXU0inzPDNrdiHT61hxr8Z4uphVdzBw%2F%2FUT2dxpo3JNfyPpHr%2FJ%2F9Ryjgdb3R3Bf2qEvaFXtRyDmDpoZOOcWCdh6A%5Cp9%2B8savWAbQbN7RMNHM%5Cxcgc1E2U9erRQEjztxuJPawZjME3dx74%2FX7S4wTXu%2FlFy6%3A1716373717229; WM_NI=n7HsGuLpxoNAdilhwBWJzkwug6Y2V4HqMQFvw6zZSFpf0F8hg0w9bsqdytAuiV3GMvQ6rAENg67%2FV61%2BSwx%2FA6qT236%2FY%2BhO0vUGCvhyt3pBzacAY7QNrPsRxivHXRJVaVM%3D; WM_NIKE=9ca17ae2e6ffcda170e2e6ee8fe25f8aa8fb88b734f3eb8fb6d54b969e9fb0d17eadbaba8bf569a198a5bbd42af0fea7c3b92aaee98894c67f90b0b890cd4ba8b7a489f64a9596b68cf67fa5ea97d3d5408caf83b2c57eb5eab6bbd24eb4ba00a7bb64a5f0b9dae179b3bcb795c47fab8afda8d07e93eabea2c846a5eaf9d0d53ef3f59d98fb2583eabfb5b139f6f197cceb45f4aa9ba8c27eaca7bcd4f34ababfada2dc3d9392beb1f25abcb7baa9db5a8a8aafb7d037e2a3")
                .header("nm-gcore-status", "1")
                .header("origin", "https://music.163.com")
                .header("priority", "u=1, i")
                .header("referer", "https://music.163.com/my/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36")
                .build();

        try (Response response = client.newCall(build).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String retBody = response.body().string();
            log.info(retBody);
            ObjectMapper objectMapper = new ObjectMapper();
            Music163PlaylistDetail music163PlaylistDetail = objectMapper.readValue(retBody, Music163PlaylistDetail.class);
            // log.info(music163PlaylistDetail);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    void spotifySearch() throws Exception {

        // 获取一下页面token


        OkHttpClient client = new OkHttpClient();

        okhttp3.Request request = new Request.Builder()
                .url("https://api.spotify.com/v1/search?q=%E7%A8%BB%E9%A6%99&type=track&limit=5&locale=zh-CN")
                // 这是https://developer.spotify.com/ 里面的token （可以）
                // .header("Authorization", "Bearer BQDsB8f_-25tDzIYinV-A5jO7Lq7Kz-LNBaLq3chBn8oeI0f00U09DQYS8_-VjfcWguUACRUZONlkDFIalBehwZtaipWuPBPnWk18JCEDMSQI4Y0SDvrPIalQyQBLgSEzSAbBWQujsyN1gCOWTzdQWuylgBRgVHHBtKA-wkmproLR0Q5UjkOU1_bLNh9IK2zQ1R4i51aN0UFt2g-yasn-3t72Mk3zeOlSHvTCBdlTGheOOkZ_GvX400alnvblvnHKVyw2PqdyZJ8nmW9_5map32sj52mJVixebOUNvLF5TY-y-YxEoZkJyUcVvWrl9ILJNnYiqR796qV1eS_mKQAnqI")
                // 这是https://open.spotify.com/ 里面的token  (可以)
                .header("Authorization", "" +
                        "" +
                        "")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String res = response.body().string();
            // log.info(res);

            ObjectMapper objectMapper = new ObjectMapper();
            SpotifyTrackQuery spotifyTrackQuery = objectMapper.readValue(res, SpotifyTrackQuery.class);
            // log.info(spotifyTrackQuery);


        }


    }


    /**
     * 里面不能判断非null 这个放弃
     *
     * @param retBody
     */
    private static void convert163Music2Gson(String retBody) {
        JsonElement jsonElement = JsonParser.parseString(retBody);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonObject playlist = jsonObject.getAsJsonObject("playlist");

        JsonArray tracks = playlist.getAsJsonArray("tracks");
        for (JsonElement track : tracks) {
            JsonObject arrayObject = track.getAsJsonObject();
            String name = arrayObject.get("name").getAsString();
            String album = arrayObject.getAsJsonObject("al").get("name").getAsString();
            List<String> authors = new ArrayList<>();
            arrayObject.getAsJsonArray("ar").forEach(e -> {
                authors.add(e.getAsJsonObject().get("name").getAsString());
            });

            log.info("歌曲: " + name);
            log.info("作者: " + authors.stream().collect(Collectors.joining(",")));
            log.info("专辑: " + album);
            log.info("---------------------------");


        }
    }


   /* @Test
    void test() {
        // 拦截网络请求以提取 OAuth 令牌
        page.navigate("https://open.spotify.com/");
        context.onRequest(request -> {
            log.info("Request URL: " + request.url());
            log.info("Request Headers: " + request.headers());
            if (request.url().contains("token")) {
                log.info("Request URL: " + request.url());
                log.info("Request Headers: " + request.headers());
            }
        });

    }*/


    @Test
    void tokenTest() {
        List<BrowserContext> contexts = browser.contexts();
        List<Cookie> cookies = contexts.get(0).cookies();
        // 这里用原先的上下文，是用原先的浏览器窗口打开的，这个不用登录
        contexts.get(0).newPage().navigate("https://open.spotify.com/");

        // 这个是新的上下文所以要登录
        // page.navigate("https://open.spotify.com/");
        List<Cookie> cookies1 = contexts.get(1).cookies();

        log.info("All Cookies:");
        for (Cookie cookie : cookies) {
            log.info(cookie.name + ": " + cookie.value);
        }
        String token = cookies.stream().filter(e -> Objects.equals(e.name, "token")).map(e -> e.value).findFirst().orElse("");
    }


    @AfterEach
    void closeContext() {
//        context.close();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }

    // @Test
    static void ex() {
        try {
            // String command = "chrome.exe --remote-debugging-port=12345 --user-data-dir=\"F:\\playwright_chrome\"";
            String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
            String command = chromePath + " --remote-debugging-port=" + getPort();
            Process process = Runtime.getRuntime().exec(command);
            Thread.sleep(1000);
            // 可以添加一些代码来处理输出流或错误流
            // process.waitFor(); // 等待进程执行完成 （把浏览器关闭了，他就走完这句代码了）
            // log.info(process);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getPort() {
        return "12345";
    }

    public BigDecimal similarAndContainsMutual(String str, String str2) {
        str = StrUtil.blankToDefault(str, "");
        str2 = StrUtil.blankToDefault(str2, "");
        BigDecimal similar = BigDecimal.valueOf(StrUtil.similar(str, str2));
        boolean b = containsMutual(str, str2);
        if (b) {
            similar = similar.add(BigDecimal.ONE);
        }
        return similar;
    }

    public boolean containsMutual(String str, String str2) {
        if (StrUtil.isBlank(str) || StrUtil.isBlank(str2)) {
            return false;
        }
        str = StrUtil.trim(str);
        str2 = StrUtil.trim(str2) ;
        return  StrUtil.contains(str, str2) || StrUtil.contains(str2, str)  ;
    }

}

package com.cc.musicplaylist.apitest;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.cc.musicplaylist.dto.spotify.SpotifyTrackQuery;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

public class SpotifyTest {

    @Test
    void spotifySearch() throws Exception {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.spotify.com/v1/search?q=Don't you see! ZARD&type=track&limit=5&locale=zh-CN")
                // 这是https://developer.spotify.com/ 里面的token （可以）
                // .header("Authorization", "Bearer BQDsB8f_-25tDzIYinV-A5jO7Lq7Kz-LNBaLq3chBn8oeI0f00U09DQYS8_-VjfcWguUACRUZONlkDFIalBehwZtaipWuPBPnWk18JCEDMSQI4Y0SDvrPIalQyQBLgSEzSAbBWQujsyN1gCOWTzdQWuylgBRgVHHBtKA-wkmproLR0Q5UjkOU1_bLNh9IK2zQ1R4i51aN0UFt2g-yasn-3t72Mk3zeOlSHvTCBdlTGheOOkZ_GvX400alnvblvnHKVyw2PqdyZJ8nmW9_5map32sj52mJVixebOUNvLF5TY-y-YxEoZkJyUcVvWrl9ILJNnYiqR796qV1eS_mKQAnqI")
                // 这是https://open.spotify.com/ 里面的token  (可以)
                .header("Authorization", "Bearer BQAvpjCDTmv8ySdPIUBOW5sTYF_nvlY0xmlp-G8RqjvlNQlXB6f6jVBp2uw3BadkujTsa4LQJIhEa8YbgAgobGnJbPWXHFa08xUNwTHfJ2Jhy7-PfFEu7NCaWgw_ok1LNetsqPvDS6l02lYsE5sGkZsvOq9Rmgo7C5B8s7Iz7ERtnYa0q1jPfw8-GPTS7JCfBWiGlhSvfzihQ9Ulwi215dHAbIgJyrywSttk9JMkHNi_rnfvfyEEh3czcNMF65WsQspyCmYzLzhqZqSgorDaxfE83VTEYBfboWh3Zoj8gyW8Jx6Uk7GvFfZ2g6V9mNIEpolU3xPWwUb_AHqhkmH0CzFrdX5_")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String res = response.body().string();
            // System.out.println(res);

            ObjectMapper objectMapper = new ObjectMapper();
            SpotifyTrackQuery spotifyTrackQuery = objectMapper.readValue(res, SpotifyTrackQuery.class);
            System.out.println(spotifyTrackQuery);



        }


    }

    @Test
    void traditionalToSimplified(){

        // String traditional = "周杰倫";
        String traditional = "asdlfjkasjdlkfjl  IJLKSJELKFJLKSD";
        String simplified = ZhConverterUtil.toSimple(traditional);
        System.out.println("繁体字: " + traditional);
        System.out.println("简体字: " + simplified);

    }

    /**
     *将项目添加到播放列表
     * https://developer.spotify.com/documentation/web-api/reference/add-tracks-to-playlist
     */
    @Test
    void addItemsToPlaylist(){

        HashMap<String, Object> objectObjectHashMap = MapUtil.newHashMap();
        objectObjectHashMap.put("position", 0);
        objectObjectHashMap.put("uris", new String[] {"spotify:track:69pyHCoBn4Ki0BzDJ2xPGI"});
        HttpResponse spotifyPlaylist = HttpUtil.createPost("https://api.spotify.com/v1/playlists/"+"3rOIvXYWWwrxkY52m124L9"+"/tracks")
                .body(JSONUtil.toJsonStr(objectObjectHashMap))
                .auth("Bearer BQDD4iIRJjqxfMfIpAMDh4edrCLHI10m_YMGffQAGCj6c5P2iTjiHgZX1TzeBvWs38szvg97euhA_dADe3Xe3GzqBi9I0moBPulgsz-7MUyWyX9h2x2I8Z7zJUj5lVvEdtDTp8TIGRAcxTkWv43XLlh3eOPpVL_IQzGEOSAbSR0gm9TnV6bIJzJv11UXGxDvgBGP3xO9AWliFrQZLihTC_RbPaKXnfbCDy_68nJLgg6e-h7RWJiiLelpMbkeLxaFb2zZCTP4UUIr62FG_Aslc9ZbmPr97LUN6lyZhAQg_zw52RsSzZtjVPYYu8kwS0hDGXENUNVp0FY9SiDys0PIRwzCn3B1")
                .execute();

        System.out.println(spotifyPlaylist.body());

    }


}

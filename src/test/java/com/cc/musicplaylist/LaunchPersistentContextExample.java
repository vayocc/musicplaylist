package com.cc.musicplaylist;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.StrUtil;
import com.cc.musicplaylist.dto.music163.Music163PlaylistDetail;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitUntilState;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * 原来默认使用chrome的用户目录会报错，换一个就好了，我晕
 * https://www.cnblogs.com/yoyoketang/p/17427192.html
 */
public class LaunchPersistentContextExample {
    /*public static void main(String[] args) {
        // 设置用户数据目录路径
        String userDataDir = "C:\\Users\\itino\\AppData\\Local\\Google\\Chrome\\User Data"; // 请确保这个路径是有效的，并且程序有权限读写

        try (Playwright playwright = Playwright.create()) {
            // 启动具有持久化上下文的浏览器实例
            BrowserContext context = playwright.chromium().launchPersistentContext(
                    Paths.get("D:\\playwright_userDataDir\\PersistentContext") ,// 使用非无头模式，便于调试
                    new BrowserType.LaunchPersistentContextOptions().setHeadless(false).setSlowMo(100).setDevtools(true) //减慢执行速度，以免太快
            );
            Page page = context.newPage();

            // 导航到目标网页
            page.navigate("https://example.com");
            System.out.println(page.title());

            // 模拟一些页面操作
            // e.g., page.click("button#submit");

            // 不要提前关闭上下文或浏览器实例，确保所有操作完成
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    @Test
    void test3() throws Exception {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().connectOverCDP("http://localhost:12345/");
        List<BrowserContext> contexts = browser.contexts();
        Page page = contexts.get(0).newPage();
        // CompletableFuture<String> authorizationFuture = new CompletableFuture<>();
        // 设置拦截网络请求的路由
        contexts.get(0).route("https://api-partner.spotify.com/**", route -> {
            Request request = route.request();
            String url = request.url();
            System.out.println("url: " + url);
            // 检查是否是目标URL
            if (url.contains("https://api-partner.spotify.com/pathfinder/v1/query")) {
                String authorizationHeader = request.headerValue("Authorization");
                if (authorizationHeader != null) {
                    System.out.println("Authorization Header: " + authorizationHeader);
                    //  authorizationFuture.complete(authorizationHeader);
                }
            }
            route.resume();
        });


        page.navigate("https://open.spotify.com/"); // , new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE)); // 不能写WaitUntilState.NETWORKIDLE不然走不下来


//        Page page2 = contexts.get(0).newPage();
//
//        page2.onResponse(response -> {
//            if (response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200) {
//                String retBody = response.text();
//                // ThreadUtil.sleep(2000);
//                System.out.println("music163结果:" + retBody);
//            }
//
//        });
//        page2.navigate("https://music.163.com/#/my/m/music/playlist?id=3150078693", new Page.NavigateOptions().setWaitUntil(WaitUntilState.LOAD));

        // page2.waitForLoadState(LoadState.NETWORKIDLE);


        System.out.println("走到了最后");
        // String s = authorizationFuture.get();
        // System.out.println("结果："+  s);


    }


    @Test
    void test() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().connectOverCDP("http://localhost:12345/");
        List<BrowserContext> contexts = browser.contexts();
        Page page = contexts.get(0).newPage();
        // 设置拦截网络请求的路由
        contexts.get(0).route("**/*", route -> {
            Request request = route.request();
            String url = request.url();
            System.out.println("url: " + url);
            // 检查是否是目标URL
            if (url.contains("https://api-partner.spotify.com/pathfinder/v1/query")) {
                String authorizationHeader = request.headerValue("Authorization");
                if (authorizationHeader != null) {
                    System.out.println("Authorization Header: " + authorizationHeader);

                }
            }
            route.resume();
        });


        page.navigate("https://open.spotify.com/", new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));


    }

    @Test
    void test2() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().connectOverCDP("http://localhost:12345/");
        List<BrowserContext> contexts = browser.contexts();
        Page page2 = contexts.get(0).newPage();

        page2.onResponse(response -> {
            if (response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200) {
                String retBody = response.text();
                // ThreadUtil.sleep(2000);
                System.out.println("music163结果:" + "完成"+StrUtil.subWithLength(retBody,0,200));
            }
        });


        page2.navigate("https://music.163.com/#/my", new Page.NavigateOptions().setWaitUntil(WaitUntilState.LOAD));

        List<Locator> playlistLocators = page2.frameLocator("iframe[name=\"contentFrame\"]").locator(".n-minelst.n-minelst-1:first-of-type .j-flag.f-cb .j-iflag").all();

        for (int i = 0; i < playlistLocators.size(); i++) {
            if (i == 0) continue;
            Locator playlistLocator = playlistLocators.get(i);

            playlistLocator.click();
            int finalI = i;
            //  如果这里再监控就重复监控了，
//            page2.onResponse(response -> {
//                if (response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200) {
//                    String retBody = response.text();
//                    // ThreadUtil.sleep(2000);
//                    System.out.println("music163结果["+ finalI +"]:"+"完成");
//                }
//
//            });
            page2.waitForResponse(response -> response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200, () -> {
                // Triggers the response
                System.out.println("music163结果["+ finalI +"]:"+"完成");
            });

        }


        System.out.println("我是最后");



    }


    @Test
    void test9() throws  Exception {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().connectOverCDP("http://localhost:12345/");
        List<BrowserContext> contexts = browser.contexts();
        List<Music163PlaylistDetail> music163PlaylistDetailList = new ArrayList<>();
        Page page2 = contexts.get(0).newPage();

        page2.onResponse(response -> {
            if (response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200) {
                String retBody = response.text();
                // ThreadUtil.sleep(2000);
                System.out.println("music163结果:" + "完成");
                Music163PlaylistDetail music163PlaylistDetail = null;
                try {
                    music163PlaylistDetail = objectMapper.readValue(retBody, Music163PlaylistDetail.class);
                    music163PlaylistDetailList.add(music163PlaylistDetail);

                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        page2.navigate("https://music.163.com/#/my", new Page.NavigateOptions().setWaitUntil(WaitUntilState.LOAD));

//        List<Locator> playlistLocators = page2.frameLocator("iframe[name=\"contentFrame\"]").locator(".n-minelst.n-minelst-1:first-of-type .j-flag.f-cb .j-iflag").all();
//        for (int i = 0; i < playlistLocators.size(); i++) {
//            if (i == 0) continue;
//            Locator playlistLocator = playlistLocators.get(i);
//            playlistLocator.click();
//            page2.waitForResponse(response -> response.url().contains("/weapi/v6/playlist/detail") && response.status() == 200, () -> {
//
//            });
//        }

        System.out.println("我是最后");





    }



}

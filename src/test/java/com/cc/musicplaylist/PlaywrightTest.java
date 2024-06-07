package com.cc.musicplaylist;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;

public class PlaywrightTest {

    private static final Logger log = LoggerFactory.getLogger(PlaywrightTest.class);
    //在本类中的所有测试之间共享。  Shared between all tests in this class.
    static Playwright playwright;
    static Browser browser;

    // 每个测试方法的新实例。 New instance for each test method.
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false) //取消无头模式，我们才能看见浏览器操作
                        .setSlowMo(100) //减慢执行速度，以免太快
                        .setDevtools(true));
    }


    @BeforeEach
    void createContextAndPage() {
         context = browser.newContext();
         page = context.newPage();
    }


    /**
     *  这个可以
     */
    @Test
    void test() {
        // 拦截网络请求以提取 OAuth 令牌
        page.navigate("https://open.spotify.com/");
        context.onRequest(request -> {
            System.out.println("Request URL: " + request.url());
            System.out.println("Request Headers: " + request.headers());
            if (request.url().contains("token")) {
                System.out.println("Request URL: " + request.url());
                System.out.println("Request Headers: " + request.headers());
            }
        });

    }

    /**
     * 这个不可以
     */
    @Test
    void token() {
        // 拦截网络请求以提取 OAuth 令牌
        page.navigate("https://open.spotify.com/");
        context.onRequest(request -> {
            System.out.println("Request URL: " + request.url());
            System.out.println("Request Headers: " + request.headers());
            if (request.url().contains("token")) {
                System.out.println("Request URL: " + request.url());
                System.out.println("Request Headers: " + request.headers());
            }
        });

    }



  /*  @AfterEach
    void closeContext() {
        context.close();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }*/



}

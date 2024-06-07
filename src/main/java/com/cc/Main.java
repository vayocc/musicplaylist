package com.cc;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.ScreenshotType;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false) //取消无头模式，我们才能看见浏览器操作
                            .setSlowMo(100) //减慢执行速度，以免太快
                            .setDevtools(true));
            BrowserContext browserContext = browser.newContext();
            Page page = browserContext.newPage();
            page.navigate("https://www.baidu.com/");
            page.locator("#kw").fill("Hard Knock Days (English Version) ");
            page.locator("#kw").press("Enter");
            page.waitForLoadState(LoadState.NETWORKIDLE);
            // String value = page.getAttribute("#kw", "value");
            page.screenshot(new Page.ScreenshotOptions().setType(ScreenshotType.PNG).setPath(Paths.get("screenshot.png")));
            // page.pause();
            System.out.println(page.url());

        }
    }

}
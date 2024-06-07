package com.cc.musicplaylist;

import com.microsoft.playwright.*;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.Test;


import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *  使用playwright的junit测试
 *  <a href="https://playwright.dev/java/docs/junit">...</a>
 */
@UsePlaywright(UsePlaywrightTest.CustomOptions.class) // 只需 @UsePlaywright 将 JUnit 注解添加到您的测试类中，即可启用 Playwright 夹具。测试夹具用于为每个测试建立环境，为测试提供所需的一切，而不是其他任何东西。
public class UsePlaywrightTest {
    /**
     * 要自定义夹具选项，应在注释中 @UsePlaywright() 实现 OptionsFactory 并指定类。
     */
    public static class CustomOptions implements OptionsFactory {
        @Override
        public Options getOptions() {
            return new Options()
                    .setHeadless(false)
                    .setContextOptions(new Browser.NewContextOptions()
                            .setBaseURL("https://github.com"))
                    .setApiRequestOptions(new APIRequest.NewContextOptions()
                            .setBaseURL("https://playwright.dev"));
        }
    }

    @Test
    public void testWithCustomOptions(Page page, APIRequestContext request) {
        page.navigate("/");
        assertThat(page).hasURL(Pattern.compile("github"));

        APIResponse response = request.get("/");
        assertTrue(response.text().contains("Playwright"));
    }
}

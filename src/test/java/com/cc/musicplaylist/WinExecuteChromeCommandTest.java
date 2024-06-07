package com.cc.musicplaylist;

import okhttp3.Request;
import org.junit.jupiter.api.Test;

/**
 * @author IT1N0
 * C:\Program Files\Google\Chrome\Application\chrome.exe
 * @Description: java 执行cmd命令
 * @date 2024/2/24 13:14
 */
public class WinExecuteChromeCommandTest {

    @Test
    void ex(){
        try {
            // String command = "chrome.exe --remote-debugging-port=12345 --user-data-dir=\"F:\\playwright_chrome\"";
            String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
            String command = chromePath + " --remote-debugging-port="+ getPort();
            Process process = Runtime.getRuntime().exec(command);
            // 可以添加一些代码来处理输出流或错误流
            // process.waitFor(); // 等待进程执行完成 （把浏览器关闭了，他就走完这句代码了）
            System.out.println(process);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getPort() {
        return "12345";
    }
}

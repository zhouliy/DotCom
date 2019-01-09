package csdnSeleniumDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.get("http://www.baidu.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String baiduUrl = "百度一下，你就知道";
        try {
            assert driver.getTitle() == baiduUrl;
            System.out.println("Test Pass");
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

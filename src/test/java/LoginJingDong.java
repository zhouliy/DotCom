import langwo.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJingDong {
    public static void main(String[] args) throws InterruptedException{

            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            try {

                Thread.sleep(1000);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
            driver.get("https://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fwww.jd.com%2F");
            Thread.sleep(3000);
            Login login = new Login();
            login.changeLogin(driver);
            login.setUserName(driver,"13882038422");
            login.setPassWord(driver,"aiSHANGrita000");
            login.clickLogin(driver);

    }
}
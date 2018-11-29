package langwo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public void changeLogin(WebDriver driver) {

        WebElement change = driver.findElement(By.linkText("账户登录"));
        change.click();
    }

    public void setUserName(WebDriver driver, String userName) {
        WebElement username = driver.findElement(By.id("loginname"));
        username.sendKeys(userName);
    }

    public void setPassWord(WebDriver driver, String passWord) {
        WebElement password = driver.findElement(By.id("nloginpwd"));
        password.sendKeys(passWord);
    }

    public void clickLogin(WebDriver driver) {
        WebElement loginbtn = driver.findElement(By.id("loginsubmit"));
        loginbtn.click();

    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Testcase_11 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
      /*
    1.Go to http://webdriveruniversity.com/
2.Go down to Login Portal
3.Click the Login Portal
4.Go to second windows
5.Fill the username and password
6.Click the login button
7.Print the popup text
8.Accept the popup
     */

    @Test
    public void Test() throws InterruptedException {

        driver.get("http://webdriveruniversity.com/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        WebElement logIn =driver.findElement(By.id("login-portal"));
        logIn.click();

        String defaultWindow= driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();

//Using for each loop ,we can switch to new window
        for (String eachWindows :
                allWindows) {
            if (!eachWindows.equals(defaultWindow)) {
                driver.switchTo().window(eachWindows);
            }
        }

        WebElement username = driver.findElement(By.id("text"));
        Thread.sleep(2000);
        username.sendKeys("asfsa");
        WebElement password = driver.findElement(By.id("password"));
        Thread.sleep(2000);
        password.sendKeys("password");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Thread.sleep(3000);
        loginButton.click();
        Thread.sleep(3000);

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();



    }
}

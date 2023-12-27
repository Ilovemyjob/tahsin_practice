import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Testcase_6 {

    WebDriver driver;

    //    Go to “http://webdriveruniversity.com/Popup-Alerts/index.html”
//            2. Click CLICK ME of JavaScript Alert
// 3. Get the pop up text
// 4. Verify the Message is “I am an alert box!“
//            5. Accept the pop up
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    //    Go to “http://webdriveruniversity.com/Popup-Alerts/index.html”
//            2. Click CLICK ME of JavaScript Alert
// 3. Get the pop up text
// 4. Verify the Message is “I am an alert box!“
//            5. Accept the pop up
    @Test
    public void test() {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        WebElement Alert = driver.findElement(By.id("button1"));
        Alert.click();
        String text =driver.switchTo().alert().getText();
        Assert.assertTrue(text.equals("I am an alert box!"));
        driver.switchTo().alert().accept();




    }
//      1. Go to “http://webdriveruniversity.com/Popup-Alerts/index.html”
    //        2. Click CLICK ME of JavaScript Confirm Box
//        3. Get the pop up text
//        4. Verify the Message is “Press a button“ (the message is worng but I
//        want to complete my test case)
//        5. Dismiss the pop up
//        6. Verify the “You pressed Cancel!” is displayed
//        7. Use the dependsOnMethods accorting to alert1
    @Test
    public void test2() {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        WebElement confirm = driver.findElement(By.id("button4"));
        confirm.click();
        driver.switchTo().alert().dismiss();


        String expected="You pressed Cancel!";
       WebElement actual= driver.findElement(By.xpath("(//p[@id='confirm-alert-text'])[1]"));
        Assert.assertEquals(expected,actual.getText());


    }
    @Test
    public void test3() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        WebElement confirm = driver.findElement(By.id("button3"));
        confirm.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement pop_up = driver.findElement(By.id("button1"));
        pop_up.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement goneMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-default'])[1]")));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  WebElement message = driver.findElement(By.id("//button[@class='btn btn-default']"));
        goneMessage.click();
        Assert.assertTrue(pop_up.isDisplayed());


    }
}

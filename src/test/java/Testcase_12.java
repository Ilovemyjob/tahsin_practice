import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class Testcase_12 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    /*
      1.Go to ”https://www.mediawiki.org/wiki/Download”
  2.Click Download MediaWiki 1.34.2
  3.Verify the file is downloaded
       */
    @Test
    public void Test() throws InterruptedException {

        driver.get("https://www.mediawiki.org/wiki/Download");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN);

        WebElement username = driver.findElement(By.xpath("(//span[@class='mw-ui-button mw-ui-progressive mw-ui-big'])[1]"));
        username.click();
        Thread.sleep(2000);
        System.out.println(username.getText());

//        String pathOfFile="C:\\Users\\Administrator\\Desktop\\FLOWER. IMG.jpg";
//        boolean isExist= Files.exists(Paths.get(pathOfFile));
//        Assert.assertTrue(isExist);
//
        String userfolder = System.getProperty("user.home");
        String download = userfolder+"\\Downloads\\mediawiki-1.37.2.zip";
        Thread.sleep(3000);
        boolean isExist= Files.exists(Paths.get(download));
        Assert.assertTrue(isExist);







    }


        @Test
        public void Test2(){

            driver.get("https://demoqa.com/dynamic-properties");

        //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            WebDriverWait wait = new WebDriverWait(driver,20);
//            WebElement visible = driver.findElement(By.id("visibleAfter"));
//            wait.until(ExpectedConditions.visibilityOf(visible));
//
//            Assert.assertTrue(visible.isEnabled());


            WebDriverWait wait = new WebDriverWait(driver,10);


            WebElement visible = driver.findElement(By.id("visibleAfter"));
            wait.until(ExpectedConditions.visibilityOf(visible));//visibilityof after locating;visibilityOfLocated while Locating

            Assert.assertTrue(visible.isEnabled());




        }
}

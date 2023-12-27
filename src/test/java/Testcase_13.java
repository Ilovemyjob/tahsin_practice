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

public class Testcase_13 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @Test
    public void TestCase2() throws InterruptedException {

        driver.get("https://demoqa.com/dynamic-properties");

        //      Thread.sleep(6000);

        WebDriverWait wait = new WebDriverWait(driver, 10);


        WebElement visible = driver.findElement(By.id("visibleAfter"));
        wait.until(ExpectedConditions.visibilityOf(visible));//visibilityof after locating;visibilityOfLocated while Locating

        Assert.assertTrue(visible.isEnabled());
    }
}
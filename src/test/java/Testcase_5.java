import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase_5 {

    //Facebook

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        // driver.quit();

    }



    @Test
    public void test(){
        driver.get("https://facebook.com");

        WebElement month_Element = driver.findElement(By.id("birthday_month"));
        Select month = new Select(month_Element);
        month.selectByIndex(3);
        month.selectByValue("4");
        month.selectByVisibleText("4");

        Assert.assertFalse(month_Element.isSelected());







    }
}

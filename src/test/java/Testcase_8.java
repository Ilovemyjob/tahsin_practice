import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_8 {




    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void Test(){

        driver.get("http://webdriveruniversity.com/File-Upload/");

        WebElement chooseFile = driver.findElement(By.id("myFile"));
        String file = "C:\\Users\\Administrator\\Desktop\\New Text Document.txt";
        chooseFile.sendKeys(file);

        WebElement submit = driver.findElement(By.id("submit-button"));
        submit.click();

        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals("Your file has now been uploaded!",alert);




    }





}

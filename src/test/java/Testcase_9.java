import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_9 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("http://webdriveruniversity.com/IFrame");
        WebElement iframe = driver.findElement(By.id("frame"));
        driver.switchTo().frame(iframe);
        WebElement products = driver.findElement(By.linkText("Our Products"));
        products.click();
        WebElement camera = driver.findElement(By.id("camera-img"));
        camera.click();
        Thread.sleep(4000);
        WebElement popUp = driver.findElement(By.className("modal-body"));
        String popText = popUp.getText();

        System.out.println(popText);











    }
    }







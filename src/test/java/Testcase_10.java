import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase_10 {



    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("http://webdriveruniversity.com/Actions");
        WebElement hoverOver = driver.findElement(By.xpath("(//button[@class=\"dropbtn\"])[1]"));

        Actions actions =new Actions(driver);
        actions.moveToElement(hoverOver).perform();

        WebElement account =driver.findElement(By.linkText("Link 1"));
        account.click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();

        WebElement clickandHold =driver.findElement(By.id("click-box"));

        actions.clickAndHold(clickandHold).perform();
        System.out.println(clickandHold.getText());

        WebElement doubleClick = driver.findElement(By.id("double-click"));
        actions.doubleClick(doubleClick).perform();


















    }
}

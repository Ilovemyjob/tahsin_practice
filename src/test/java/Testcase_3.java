import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_3 {
    WebDriver driver;
    /*
            Go to ” https://www.thetrainline.com/”
     2. Select return button
    3. Check the return is selected
     4. Verify the returnDate input box is Enabled
    5. Check the one way is not selected
         */
    @Before
    public void before() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test(){

    driver.get("https://www.thetrainline.com/");

        WebElement returnButton = driver.findElement(By.xpath("//input[@id='return']"));
        returnButton.click();
        Assert.assertTrue(returnButton.isSelected());



        WebElement returnDate = driver.findElement(By.xpath("//input[@id='page.journeySearchForm.inbound.title']"));
        Assert.assertTrue(returnDate.isEnabled());

        WebElement oneWay = driver.findElement(By.xpath("//input[@id='single']"));
        Assert.assertFalse(oneWay.isSelected());






    }
    @After
    public void tearDown(){
       // driver.quit();

        }





    }




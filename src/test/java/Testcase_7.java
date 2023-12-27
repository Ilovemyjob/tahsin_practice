import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Testcase_7 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }



    @Test
    public void Test(){


        WebElement options = driver.findElement(By.id("button1"));
        Select option = new Select(options);
        Assert.assertTrue(option.getFirstSelectedOption().getText().equals(""));

        List<WebElement> optionss = option.getOptions();
        List<String> actual = new ArrayList<String>();

        for (WebElement each :
                optionss) {
            actual.add(each.getText());
        }

      //  Assert.assertEquals(expected,actual);





    }









}



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Testcase_1 {




        public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            String expected=driver.getTitle();

         //   WebElement emailTextBox = driver.findElement(By.id("session_email"));
            driver.get("https://www.etsy.com/de/");
            driver.navigate().back();
            String actual = driver.getTitle();
            System.out.println(actual);

            if(actual.equals(expected) ){

                System.out.println("true");

            }else{
                System.out.println("false");
            }

            driver.quit();
        }






}

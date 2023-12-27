import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Testcase_2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.de/");
        WebElement search =driver.findElement(By.xpath("//input[@id='gh-ac']"));
        search.sendKeys("lg g6",Keys.ENTER);

        WebElement search_button =driver.findElement(By.xpath("//input[@id='gh-btn']"));




        WebElement result= driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));

        System.out.println(result.getText().substring(0,3));





    }







}





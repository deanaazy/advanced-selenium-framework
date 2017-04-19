package sample;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
//import

public class Actionwords {

    public static void main(String[] args){
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        try {
            Thread.sleep(5000);  // Let the user actually see something!
            WebElement searchBox = driver.findElement(By.id("lst-ib"));
            searchBox =driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
            searchBox =driver.findElement(By.cssSelector("#lst-ib"));
            searchBox.sendKeys("Juventus");
            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]"));
            //searchBox.submit();
            submitButton.click();
            Thread.sleep(5000);  // Let the user actually see something!
            String bodyText = driver.findElement(By.tagName("body")).getText();
            Assert.assertTrue("official website not found!", bodyText.contains("www.juventus111.com"));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
        driver.quit();
        }
    }
}
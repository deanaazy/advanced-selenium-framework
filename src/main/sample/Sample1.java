package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/**
 * Created by deana on 2017/4/18.
 */
public class Sample1 {
    public static void main(String[] args){
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        try {
            Thread.sleep(5000);  // Let the user actually see something!
            WebElement searchBox = driver.findElement(By.id("lst-ib"));
            searchBox.sendKeys("ChromeDriver");
            searchBox.submit();
            Thread.sleep(5000);  // Let the user actually see something!
        } catch(Exception exp){

        }
        driver.quit();
    }
}

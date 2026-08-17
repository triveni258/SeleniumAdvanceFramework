package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class EndToEndTest {
    @Test
    public void endToEndTest() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.goibibo.com/");
//        driver.findElement((By.cssSelector("input[placeholder=\"From\"]"))).sendKeys("Mumbai");
//        Alert alert= driver.switchTo().alert();
//        alert.dismiss();
           ChromeOptions options = new ChromeOptions();

                options.addArguments("--disable-notifications");

                WebDriver driver = new ChromeDriver(options);


                driver.manage().window().maximize();

                driver.get("https://www.goibibo.com/");

                WebDriverWait wait =
                        new WebDriverWait(driver, Duration.ofSeconds(10));

                WebElement closeButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//span[contains(@class,'sc-koXPp')]")));

                closeButton.click();
                wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(@class,'sc-jlwm9r-1')]")))).click();
                //round trip
        driver.findElement(By.xpath("//li[@data-cy=\"roundTrip\"]")).click();


        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("fromCity"))).click();

//
//        WebElement dropdown = driver.findElement(
//                By.xpath("//div[contains(@class,'scroll')]"));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript(
//                "arguments[0].scrollTop=arguments[0].scrollHeight",
//                dropdown);
//
//        driver.findElement(
//                        By.xpath("//*[contains(text(),'Mumbai')]"))
//                .click();

            }
        }





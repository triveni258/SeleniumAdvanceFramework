package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CalenderHandle {
    @Test
    public  void calenderHandle() {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody")));

       // driver.findElement((By.xpath("//input[@value=\"2027\"]"))).click();
        List<WebElement> lists=driver.findElements(By.xpath("//tbody/tr/td"));
        System.out.println(lists.size());
        boolean found = false;
        for(WebElement list: lists)
        {
           // System.out.println(list.getText());

        if(list.getText().equals("Potato"))
        {

            found=true;
            break;
        }}
        if(found)
        {
            System.out.println("Potato is present");
        }
        else {
            System.out.println("Potato is not present");
        }



    }
}

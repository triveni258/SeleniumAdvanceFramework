package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsMethods {
    @Test
    public void actionPerform() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        Actions action= new Actions(driver);
        //mouse hover
        action.moveToElement(driver.findElement(By.xpath("//span[text()='Check-In']"))).perform();
    }
}

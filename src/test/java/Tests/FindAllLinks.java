package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinks
    {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

            // Find all links with a tagname
            List<WebElement> links= driver.findElements((By.tagName("a")));
            // Print total number of links
            System.out.println( links.size());

            for(WebElement list: links)
            {
                System.out.println(list.getText());
            }


}}

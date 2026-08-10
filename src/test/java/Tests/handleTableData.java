package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class handleTableData extends BaseTest {
    @Test
    public void getDate() {
        driver.get("https://rahulshettyacademy.com/upload-download-test/");
        //find first row text in the table
       List<WebElement> firstRowTesxt=
               driver.findElements(By.cssSelector("div[id='row-0']"));
       for( WebElement row: firstRowTesxt)
       {
           System.out.println(row.getText());
       }
       //Count total rows.

        List <WebElement> CountRows=
                driver.findElements(By.xpath("//div[starts-with(@id,'row-')]"));
        System.out.println("Total Rows" + CountRows.size());
        //Print the third row.
        //Print the last row.
        //Print the first column.
        //Print the last column.
        //Find the highest price.
        //Find the lowest price.
        //Find the average price.
        //Verify "winter" exists.
        List<WebElement> text=driver.findElements(By.cssSelector("#row-4"));
        for(WebElement row: text)
        {
            if(row.getText().equalsIgnoreCase("Winter"))
            {
                System.out.println(row.getText());
            }
        }

        //Verify "Grapes" does not exist.
        List<WebElement> rows = driver.findElements(By.xpath("//div[starts-with(@id,'row-')]"));

        boolean found = false;

        for (WebElement row : rows)
        {
            if (row.getText().contains("Grapes"))
            {
              found = true;
                break;
            }}


        if (!found) {
            System.out.println("Grapes does not exist.");
        } else {
            System.out.println("Grapes exists.");
        }

        WebElement texts= driver.findElement(By.xpath("//span[text()='Note: Data will be reset after page refresh.']"));
        String message=texts.getText();
        System.out.println( message.split(" ")[3]);









    }}








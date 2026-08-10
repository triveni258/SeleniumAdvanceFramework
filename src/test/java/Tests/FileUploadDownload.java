package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadDownload extends BaseTest {
    @Test
    public void uploadFile() throws IOException {


        driver.get("https://rahulshettyacademy.com/upload-download-test/");

        WebElement upload = driver.findElement(By.id("fileinput"));

        Runtime.getRuntime().exec("D:\\TriveniWorkSpace-doNotTouch\\DataDriven\\UploadFile7.exe");

       // upload.sendKeys("D:\\TriveniWorkSpace-doNotTouch\\DataDriven\\Book1.xlsx");
    }
}

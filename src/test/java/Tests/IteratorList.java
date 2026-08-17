//package Tests;
//
//import java.util.Iterator;
//import java.util.Set;
//
//import Base.BaseTest;
//import Listeners.TestListener;
//import junit.framework.TestListener;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//@Listeners(TestListener.class)
//
//public class IteratorList extends BaseTest {
//
//    @Test
//
//
//    public void getListLinks(){
//
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//parent window
//        driver.findElement(By.cssSelector("div .blinkingText")).click();//click on child window
//
//
//        //switch back to parent window
//        Set<String> handles = driver.getWindowHandles();
//        Iterator<String> it = handles.iterator();
//        String parentWindow= it.next();
//        String childWindow= it.next();
//       ;
//
//        //switch to child window
//        driver.switchTo().window(childWindow);
//        System.out.println(driver.getTitle());
//
//        driver.switchTo().window((parentWindow));
//        System.out.println(driver.getTitle());
//        //click on second child window
//        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Sign Up']")).isDisplayed());
//
//
//
//    }
//}
//
//
//

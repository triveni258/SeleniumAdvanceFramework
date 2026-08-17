package listeners;

import Base.BaseTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

import Utilities.ExtentReporter;
import Utilities.ScreenshotUtil;

public class TestListener extends BaseTest implements ITestListener {

    ExtentTest test;
    ExtentReports extent = ExtentReporter.getReportObject();
    ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result) {

        test= extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);//Set is method it will push object into threadlocal.
        //Thread local will assigh unique THREAD ID to each test.
        ;    }
    @Override
    public void onTestSuccess(ITestResult result) {

        extentTest.get().log(Status.PASS,"Test Passed");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());//get will extract it
        try {
            driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (Exception e1) {
            //Auto generated catch block
            e1.printStackTrace();
        }

        String filePath = null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName(),driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
        extentTest.get().addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());
    }



    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

    }

}
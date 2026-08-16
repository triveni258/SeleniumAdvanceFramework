package listeners;

import Base.BaseTest;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

import Utilities.ExtentReporter;
import Utilities.ScreenshotUtil;

public class TestListener extends BaseTest implements ITestListener {

    ExtentReports extent = ExtentReporter.getReportObject();

    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {

            String path = ScreenshotUtil.captureScreenshot(driver,
                    result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(path);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

    }

}
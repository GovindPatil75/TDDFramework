package com.TDDFramework.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersExtentReport extends BaseClass implements ITestListener {
	

	
	ExtentReports extent=ExtentReporterNG.ExtentReportGenrater();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
    
public void onTestStart(ITestResult result) {
	    ObjectRepo.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(ObjectRepo.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test Case Is Pass");
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test Case Is Fail");
		extenttest.get().fail("Tc Fail Image===>").addScreenCaptureFromBase64String(getScreenShotFailure());
		}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case Is Skip");
	
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
    public String  getScreenShotFailure() {
    	String image=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return image;
    }
}

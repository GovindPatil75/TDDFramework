package com.TDDFramework.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void ObjectCreation() throws IOException {
	 //excel=new ExcelDataProvider();
	
	}
	 @BeforeMethod
	 public void Setup() throws Exception {
		 
		 //we launch the Browser
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 //browser maximise
		 driver.manage().window().maximize();
		 //impliciltly wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //get the url
		 driver.get(PropertiesOperation.getvalusebasedonKey("BaseUrl"));
	 }
	 
	 @AfterMethod
	 public void closeBrowser() {
		 //close browser
		 driver.quit();
	 }
}

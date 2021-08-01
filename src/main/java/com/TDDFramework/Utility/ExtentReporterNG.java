package com.TDDFramework.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
   
	 public static ExtentReports extent;
	
	public static ExtentReports ExtentReportGenrater() {
		
		String reportPath=System.getProperty("user.dir")+"\\TestReport\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("TDDFrameworkReport");
		reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();     
	extent.attachReporter(reporter);
	extent.setSystemInfo("System Enviornment", "url");
	extent.setSystemInfo("QA Name", System.getProperty("user.name"));
	extent.setSystemInfo("Exeuted On Browser", "Chrome");
	extent.setSystemInfo("Executed on OS", System.getProperty("os.name"));
	return extent;
	
	}
}

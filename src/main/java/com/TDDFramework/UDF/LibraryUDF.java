package com.TDDFramework.UDF;

import org.openqa.selenium.WebElement;

import com.TDDFramework.Utility.ObjectRepo;
import com.aventstack.extentreports.Status;

public class LibraryUDF {
	
	
	public static void sendkeys_Custom(WebElement element,String ValuetobeSent,String fieldname) {
		
		try {
		element.sendKeys(ValuetobeSent);
		//value succesfully pass
		ObjectRepo.test.log(Status.PASS, ValuetobeSent+">>Value Passed to  :"+fieldname);
		}catch(Exception e) {
			//value not send
			ObjectRepo.test.log(Status.FAIL, ValuetobeSent+">>Value unable to Passed :"+fieldname);	
			
		}
		 
	}
public static void Click_Custom(WebElement element,String fieldname) {
		
		try {
		element.click();
		//value succesfully pass
		ObjectRepo.test.log(Status.PASS, "Clicked Succesfully.... :"+fieldname);
		
		}catch(Exception e) {
			//value not send
			ObjectRepo.test.log(Status.FAIL, " Unable to Click.... :"+fieldname);
		}
		 
	}
}

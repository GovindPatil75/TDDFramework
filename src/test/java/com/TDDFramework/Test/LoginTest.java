package com.TDDFramework.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TDDFramework.PageObject.LoginPageObject;
import com.TDDFramework.UDF.LibraryUDF;
import com.TDDFramework.Utility.BaseClass;
import com.TDDFramework.Utility.ExcelDataProvider;

public class LoginTest extends BaseClass{

	@Test
	public void verify_loginTest() throws Exception {
		
		LoginPageObject login=PageFactory.initElements(driver, LoginPageObject.class);
		
		
//		String email=excel.getStringData(0, 1, 0);
//		String password=excel.getStringData(0, 1, 1);
//		System.out.println(email);
//		System.out.println(password);
		
		LibraryUDF.sendkeys_Custom(login.gettxt_email(), "govindPatil123", "Emailid");
		LibraryUDF.sendkeys_Custom(login.gettxt_password(),"12345678","Password");
		LibraryUDF.Click_Custom(login.getbtn_login(),"login");
		Assert.assertTrue(false);
		
		
	}
	
}

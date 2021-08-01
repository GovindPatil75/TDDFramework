package com.TDDFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {

	 WebDriver driver;
	 
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement btn_login;
	
	
	//declaration of WebElement
	//constructor 
	public LoginPageObject(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//creating methods for each element
	public WebElement gettxt_email() {
		return txt_email;
	}
	public WebElement gettxt_password() {
		return txt_password;
	}
	public WebElement getbtn_login() {
		return btn_login;
	}
	
}

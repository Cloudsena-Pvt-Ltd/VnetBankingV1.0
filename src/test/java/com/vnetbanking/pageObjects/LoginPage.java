package com.vnetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {

		rdriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath = "//input[@name='uid']")
	
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	
	WebElement btnlogin;
	
	
	public  void setusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setpasswd(String pword)
	{
		password.sendKeys(pword);
	}
	
	public void clickbutton()
	{
		btnlogin.click();
	}

}

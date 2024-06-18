package com.vnetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vnetbanking.pageObjects.LoginPage;

public class TC_logintest_001  extends Baseclass
{
	@Test
  public void logintest() throws IOException
  {
	 
	  LoginPage lp=new LoginPage(driver);
	  lp.setusername(uname);
	  
	  lp.setpasswd(pword);
	  
	  lp.clickbutton();
	  
	  if(driver.getTitle().equals("Guru99: Free Online Tutorials and Business Software Reviews"))
		  
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  capturescreen(driver, "logintest");
		  Assert.assertFalse(false);
		  
	  }
	  
  }
	
	
}

package com.vnetbanking.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.vnetbanking.Utilities.ReadConfig;

public class Baseclass 
{

	ReadConfig RC=new ReadConfig();
	
	public String url=RC.getApplicationurl();
	
	public String uname=RC.getusername();
	
	public String pword=RC.getPassword();
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		
		 driver.get(url);
		
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
	
	
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File(System.getProperty("user.dir")+"/Screenshots"+tname+".png");
	    FileUtils.copyFile(src, dest);
	    System.out.println("Screenshot Taken");
	    
		
	}

}

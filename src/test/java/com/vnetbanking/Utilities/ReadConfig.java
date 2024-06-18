package com.vnetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{

	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			
		FileInputStream fi=new FileInputStream(src);
		pro=new Properties();
		pro.load(fi);
		
		}catch (Exception e) 
		{
			System.out.println("Exception is "+ e.getMessage());
		}
		
	}
	
	public String getApplicationurl()
	{
		String url=pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getusername()
	{
		String username=pro.getProperty("uname");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("pword");
		return password;
	}
	
	
}

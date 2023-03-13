package com.Guru99demo.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {

	//C:\Users\Ya Rahman\eclipse-workspace\NewProjects\com.Guru99demo\ConfigProperties\ConfigProperties.file
	
	
	public FileReader fr;
	public Properties pr;
	
	
	 String path=System.getProperty("user.dir")+"\\ConfigProperties\\ConfigProperties3.file";
	
	
	 
	 
	 public String SelectBrowser() throws IOException 
		{
			fr=new FileReader(path);
			pr=new Properties();
			pr.load(fr);
			
			String data=pr.getProperty("Browser");
			
			return data;
		}
	 
	public String Geturl() throws IOException 
	{
		fr=new FileReader(path);
		pr=new Properties();
		pr.load(fr);
		
		String data=pr.getProperty("URL");
	
		return data;
	}
	
	
	public String GetuserID() throws IOException 
	{
		fr=new FileReader(path);
		pr=new Properties();
		pr.load(fr);
	    String data=pr.getProperty("UserID");
		return data;
	
	}
	
	
	
	public String Getpassword() throws IOException 
	{
		fr=new FileReader(path);
		pr=new Properties();
		pr.load(fr);
	
	  String data=pr.getProperty("Password");
		return data;
	
	}
	
	
}

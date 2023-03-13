package com.Stormoverseas.TestCases;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Stormoverseas.PageObjects.Homepage;
import com.Stormoverseas.PageObjects.StudyAbroadPage;

import cucumber.api.java.it.Date;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	public Homepage homepage;
	public StudyAbroadPage  studyabroadpage;
	
	
	
	public static 	FileReader reader;
	public static Properties prop;
	public  static String path=System.getProperty("user.dir")+"\\ConfigFiles\\ConfigProperties.file";
	

@BeforeTest
	public static void AppLaunch() throws IOException 
	 {
		reader=new FileReader(path);
		prop=new Properties();
		prop.load(reader);
		
		String br=prop.getProperty("Browser");
		
		
		if (br.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
   
		else if(br.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		

	}
	
	
	
	
	

	
	
	public static void Waithelper(WebElement element) 
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		

	}
	
	
	 public static void Takescreenshot(String Filename) throws IOException
     {
		 
	 LocalDateTime myDateObj = LocalDateTime.now();  
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH'hrs'-mm 'mins'");  
	 String formattedDate = myDateObj.format(myFormatObj);  
			     
		 
       TakesScreenshot ts=  (TakesScreenshot) driver;
       File  SS= ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(SS, new File(System.getProperty("user.dir")+"\\Screenshots\\"+Filename+" "+formattedDate+".png"));

      }
	
	
	public static void Teardown() 
	{
		driver.close();

	}
	
}

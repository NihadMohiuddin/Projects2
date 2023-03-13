package com.Guru99demo.TestCases;

import java.io.File;

import org.apache.logging.log4j.*;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.codehaus.plexus.util.FileUtils;
import org.junit.AfterClass;
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
import org.testng.annotations.Parameters;

import com.Guru99demo.Pageobjects.LoginPage;
import com.Guru99demo.Utils.ReadConfig;
import com.aventstack.extentreports.utils.FileUtil;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	static ReadConfig rdconfi=new ReadConfig() ;
	public static Logger logger = LogManager.getLogger(BaseClass.class.getName());
	static LoginPage lp;
	
	
	@BeforeClass
	@Parameters ("browsername") //after creating all Tc then run using paramter beacuse cant run directly in TC
	public static void Setup() throws IOException
	{
	
   	String browsername1=rdconfi.SelectBrowser();
		
		
		switch (browsername1) 
		{
		
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
	     	driver=new ChromeDriver();
		   
	     	break;

        case "firefox":
        	WebDriverManager.firefoxdriver().setup();
	     	driver=new FirefoxDriver();
			break;
			
       case "id":
    	    WebDriverManager.edgedriver().setup();
	     	driver=new EdgeDriver();
			break;
			
        
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get(rdconfi.Geturl());
	    logger.info("url opened");
		

	}
	
	
	public static void TakescreenShot(String Filename) throws IOException
	{   String sspath=System.getProperty("user.dir")+"\\Screenshots"+Filename+".png";
		
	    TakesScreenshot ts= (TakesScreenshot) driver;
		File ss= ts.getScreenshotAs(OutputType.FILE);
        File ff=new File(sspath);
        FileUtils.copyFile(ss,ff);
		
		
	}
	
	
	public static void Waithelper(WebElement webelement)
	   {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		}
	
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public static void Teardown() 
	{
	    driver.quit();

	}
	
	
}

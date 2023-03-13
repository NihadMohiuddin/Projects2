package PractisingOldPackages;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.FileWriteMode;

public class checkboxes {

	     @SuppressWarnings("deprecation")
		public static void main(String[] args) throws IOException  {
	    	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	    		WebDriver driver;
	    		driver=new ChromeDriver();
	    	    driver.manage().window().maximize();
	    		
	    		driver.get("https://text-compare.com/");
	    		
	    		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy, HH-mm-ss");
	    		Date date = new Date();
	    	   String datetime=format.format(date);
	    		System.out.println(datetime);    		
	    		
	         TakesScreenshot ts= (TakesScreenshot)driver;
	    	 File ssfile= ts.getScreenshotAs(OutputType.FILE);
	    	 File fil=new File("C://solder//"+datetime+".png");
	    	 FileHandler.copy(ssfile, fil);
	    	
	    	 
	    	 
	    	 
	    	 
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

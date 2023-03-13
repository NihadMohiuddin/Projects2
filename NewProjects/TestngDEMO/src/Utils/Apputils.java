package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Apputils {
	 public WebDriver driver;
	
	 
	 
	@BeforeSuite
	public void launchApp() 
	
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("http://flights.qedgetech.com/");
		
    }

     @AfterSuite
     public void Closeapp()
  
     {  
	  driver.close();
     }

     
     
     
     
     
     
     
     
     

}


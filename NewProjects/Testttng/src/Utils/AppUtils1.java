package Utils;

import java.sql.Driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppUtils1 {

	WebDriver Driver;

	
	public static void launchapp(String url) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		Driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	
	
	
	
	
}

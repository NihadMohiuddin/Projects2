package Ecommerce.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class AppUtils {

	public static	WebDriver driver ;
	public static   String URl="http://tutorialsninja.com/demo/";
	
	
	
	@BeforeSuite
	public static  void LaunchApp() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(URl);
		
	}
	
	
	
    // @AfterSuite
	public static  void CloseApp() 
	{
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

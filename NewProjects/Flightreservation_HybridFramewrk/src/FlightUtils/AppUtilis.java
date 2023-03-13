package FlightUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtilis {

	
	
	public static WebDriver driver;
	 
	public static String  URL="http://flights.qedgetech.com/";
	
	@BeforeSuite
	public static void LaunchApp() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	
	@AfterSuite
    public static void CloseApp() 
	
	{
		driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

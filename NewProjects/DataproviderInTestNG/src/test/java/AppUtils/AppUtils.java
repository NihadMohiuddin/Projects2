package AppUtils;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppUtils {

	public static WebDriver driver;
	public static String URL="";
	
	
	@BeforeTest
	public static void LaunchApp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nopcommerce.com/en");
		
	}
	
	
	
	
   @AfterTest
	public static void CloseApp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}

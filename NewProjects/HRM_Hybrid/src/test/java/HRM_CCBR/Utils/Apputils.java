package HRM_CCBR.Utils;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apputils {


	public static WebDriver driver;
	public static String URL="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	
	@BeforeSuite
	public static void LaunchApp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
	}
	
	
	
	
   //@AfterSuite
	public static void CloseApp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}

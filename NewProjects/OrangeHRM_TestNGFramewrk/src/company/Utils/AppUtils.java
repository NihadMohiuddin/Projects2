package company.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {

	public static WebDriver driver;
	public static String URL="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	
	
	
	@BeforeSuite
	public static void LaunchApp() 
	{  
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
    }
	
	
	
	
	@AfterSuite
	public static void CloseApp() 
	{
		 driver.close();

	}
	
	
	
	
	
	
	
	
}

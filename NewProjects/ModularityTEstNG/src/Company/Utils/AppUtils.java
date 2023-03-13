package Company.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {

	public static WebDriver driver;
	public static String URL="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	
	@BeforeSuite
	public  void LaunchApp()
	{
		System.setProperty("webdriver.chrome.dirver", "chromedriver.exe");
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.get(URL);
	}
	
	
	
	
	
	@AfterSuite
	public  void CloseApp() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

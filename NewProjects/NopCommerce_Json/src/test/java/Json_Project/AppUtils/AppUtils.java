package Json_Project.AppUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppUtils {

	
	public static WebDriver driver;
	public static String URL="https://www.nopcommerce.com/en";
	
	
	@BeforeTest
	public static void LaunchApp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
	}
	
	
	
	
 //  @AfterTest
	public static void CloseApp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

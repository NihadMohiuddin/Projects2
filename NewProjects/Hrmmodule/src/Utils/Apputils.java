package Utils;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Apputils {

	public static WebDriver driver;
	String URL="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void LaunchApp() 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
	}
	/*
	@AfterTest
	public void CloseApp() 
	{
     driver.close();

	}
	
	*/
	
	
	
	
}

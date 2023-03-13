package Qedgepractise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementANDElements {

public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
           //both elemts and elemnt
	List <WebElement>all=driver.findElement(By.tagName("form")).findElements(By.name("color"));
	
	System.out.println(all.size());
	
	
	
	
	
}
}
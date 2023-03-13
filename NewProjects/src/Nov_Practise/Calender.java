package Nov_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(3);
		
		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(2000);
		String yeartxt=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		
		while(!yeartxt.equals("2025")) 
		{
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
			yeartxt=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
	
		String Monthtxt=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!Monthtxt.toLowerCase().equals("september")) 
		{
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            Monthtxt=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

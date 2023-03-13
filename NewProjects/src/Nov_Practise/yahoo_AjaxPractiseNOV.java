package Nov_Practise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_AjaxPractiseNOV {

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		
		driver.findElement(By.id("yschsp")).sendKeys("Allahu");
		Thread.sleep(2000);
		List<WebElement> table=driver.findElement(By.className("sa-tray-list-container")).findElements(By.tagName("li"));
		System.out.println("Total no items  "+table.size());
		
		for (WebElement eachelemt : table) 
		{
		   
			
			String txt=	eachelemt.getText();
			System.out.println(txt);
			
			if (txt.toLowerCase().equals("allahu images"))
					
			  {
				eachelemt.click();
			  }
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

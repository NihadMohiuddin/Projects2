package Nov_Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
		
    try 
  {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[4]/div[1]/div[7]/div/div[2]"))).click();

  }
	
	catch (Exception e)
  {
		List<WebElement> all=driver.findElement(By.xpath("//div[4]/div[1]/div[6]/div/div[2]")).findElements(By.tagName("div"));
		
		
		System.out.println(all.size());
		
		for (WebElement eachelmt : all)
		   {
			String x=eachelmt.getText();
			System.out.println(x);
			
			if (x.equals("Albania")) 
			     {
				eachelmt.click();
			     }
		
		   }
	 }	
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}

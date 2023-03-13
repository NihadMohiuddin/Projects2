package Qedgepractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlesuggestions_qedge {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  driver.get("https://www.bing.com/");
		 

		      
		driver.findElement(By.id("sb_form_q")).sendKeys("cricket");
		
		List<WebElement> list=	driver.findElement(By.id("sa_ul")).findElements(By.tagName("li"));
		System.out.println("NO Of Suugestions are  "+ list.size());
		
		for(int i=0;i<list.size();i++) 
		{
			String txt=list.get(i).getText();
			System.out.println(txt);
		}
		
		
		for(int i=0;i<list.size();i++) 
		{
			
			try 
	   {
			String txt=list.get(i).getText();
			if (txt.equalsIgnoreCase("cricket live score")) 
			{
				list.get(i).click();
				
			}
		}
		      
		
		catch (Exception e) {
			//System.out.println(e);
		}
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
	}
	}



package Qedgepractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.cli.CliCommand;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Calender_whileloop2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver;
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
      	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("http://flights.qedgetech.com/user/nihad.html");
           
			//login id
			driver.findElement(By.name("email")).sendKeys("md.Nihadm@gmail.com");
			driver.findElement(By.name("password")).sendKeys("allahu786");
			driver.findElement(By.xpath("//button[contains(text(),\"Sign In\")]")).click();
			
			driver.findElement(By.id ("search-date")).click();//click on cale
			
			String flydate = "20/september/2024";
			String[] temp = flydate.split("/");
			String dat = temp[0];
			String month = temp[1];
			String year = temp[2];
			
		 String yeartxt = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		 
		 //*****************first year and then go tot ,mointh***********
		 
		 //yeartext=2022now 
		       while(!yeartxt.equals(year)) 
			{
				   //button element
				   driver.findElement(By.linkText("Next")).click();
			 //if we dont give below line always the yeartext=2022 so need to update becuse year changes by clicking
				 yeartxt=driver.findElement(By.className("ui-datepicker-year")).getText();
			
			}
			
		
		        
		        String monthtxt = driver.findElement(By.className("ui-datepicker-month")).getText();
				   
				   while (!monthtxt.equalsIgnoreCase(month)) 
				   {
					   driver.findElement(By.linkText("Next")).click();
					   monthtxt = driver.findElement(By.className("ui-datepicker-month")).getText();
				    }
			 
			 
		        
		        
			   
			 
			   
			   List<WebElement> rows=driver.findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("tr"));
			   for(int r=1;r<rows.size();r++) 
			   {
				   List<WebElement> colu= rows.get(r).findElements(By.tagName("td"));
				   
				   for (WebElement eachcolu : colu)
				   {
					
				}
				   
			   }
			   
	}

}

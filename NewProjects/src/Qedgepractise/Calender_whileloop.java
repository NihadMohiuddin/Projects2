package Qedgepractise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_whileloop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
        //click on ok button
       driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
       driver.findElement(By.xpath("//div[1]/p-calendar[1]/span[1]/input[1]")).click();
		
		
		String format="20/September/1993";
		String[] temp=format.split("/");
	String date=temp[0];
	String month=temp[1];
	String year=temp[2];
	
	//in order first year ,month,date
	 //as in advance we dont know how many time to click so whileloop	
	     
	 //if not matching click again check not matching clickagain [if matching comes out]
	//caputing txt of the year
	String yeartxt= driver.findElement(By.xpath("//span/div/div/div[1]/div/span[2]")).getText();
     while(!yeartxt.equals(year))
	   {
	        	
		 driver.findElement(By.xpath("//span/div/div/div[1]/a[1]")).click();//button
		 //update compare,update compare.....
		 yeartxt= driver.findElement(By.xpath("//span/div/div/div[1]/div/span[2]")).getText();

	    }
	    
		
	     String monthtxt=driver.findElement(By.xpath("//span/div/div/div[1]/div/span[1]")).getText();
		while(!monthtxt.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.xpath("//span/div/div/div[1]/a[1]")).click();//button

			monthtxt=driver.findElement(By.xpath("//span/div/div/div[1]/div/span[1]")).getText();
			
		}
		
		List<WebElement> rows=driver.findElement(By.className("ng-tns-c58-10")).findElements(By.tagName("tr"));
		for (int r = 1; r < rows.size(); r++) 
		{
			List<WebElement> columns=rows.get(r).findElements(By.tagName("td"));
		
		for (WebElement eachcolum : columns) {
			if(eachcolum.getText().equals(date))
			{    System.out.println(eachcolum.getText()); 
				eachcolum.click();
				break;
			 }
		}
		
		
		
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

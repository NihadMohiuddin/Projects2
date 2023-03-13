package Qedgepractise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.moneycontrol.com/ipo/ipo-historic-table?classic=true");
		
        List<WebElement>el=	driver.findElement(By.id("mytable")).findElements(By.tagName("tr"));
		
		int x=el.size();
		System.out.println(x);
		
		
		
		for (int r =2; r<=10; r++) 
		{
			
			List<WebElement>totalcolms= el.get(r).findElements(By.tagName("td"));
		
			
			for (int c = 0; c<2; c++) 
			{
				
				System.out.print(totalcolms.get(c).getText()+ "  ");
				
			}
			   
				  
				    
			   
			
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
}

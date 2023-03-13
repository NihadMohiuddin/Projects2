package PractisingOldPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	
		   List<WebElement> rows=	driver.findElement(By.id("customers")).findElements(By.tagName("tr"));
		          System.out.println("The no of rows are "+rows.size());
		
		
		          List<WebElement> colum1=	rows.get(0).findElements(By.tagName("th"));
		          System.out.println("The no of colum are "+colum1.size());
		
		
		for(int r= 1;r<rows.size();r++)
			
		{
			List<WebElement> colum=rows.get(r).findElements(By.tagName("td"));
			
			for (int c=1;c<colum.size()-1;c++) 
			{
				
				System.out.print(colum.get(c).getText()+ " ");
			}
			
			System.out.println("");
		}
		
		
		
		
		
		
		
	}		
}

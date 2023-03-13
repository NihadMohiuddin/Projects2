package Qedgepractise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_Qedge {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         	WebDriver driver;
         	driver=new ChromeDriver();
         	driver.manage().window().maximize();
         	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("popupDatepicker")).click();

		List<WebElement> rows=	driver.findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("tr"));
		
		for (int r =1; r < rows.size(); r++) {
			List<WebElement> colu=rows.get(r).findElements(By.tagName("td"));
			
			for (WebElement eachcol : colu) {
				
				System.out.print(eachcol.getText()+"   ");
			}
			
			System.out.println("");
		}
		
//----------------------------------------------------------------------------------------		
	      
	
	}
			
			
	
	
		
		
		
	
	}



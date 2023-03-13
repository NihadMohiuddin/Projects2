package Qedgepractise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PractisingOldPackages.Forloop;

public class Flightswebsite_qedge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("name")).sendKeys("Nihad");
		driver.findElement(By.id("contact")).sendKeys("9603003528");
		driver.findElement(By.id("email")).sendKeys("md.nihadm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("allahu786");
		
		Select slct=new Select(driver.findElement(By.name("gender")));
		List<WebElement>dropdwnlist=slct.getOptions();
	System.out.println("No of items in dropdown are  "+dropdwnlist.size());	
	
		for (WebElement eachdropdown : dropdwnlist) 
		{       
			  System.out.println(eachdropdown.getText());
			
			if (eachdropdown.getText().equalsIgnoreCase("Male")) {
				eachdropdown.click();
			}
	    }
		
		driver.findElement(By.id("popupDatepicker")).click();
		
		Select slctyear=new Select(driver.findElement(By.className("ui-datepicker-year")));
		slctyear.selectByVisibleText("1993");
		
		Select slctymonth=new Select(driver.findElement(By.className("ui-datepicker-month")));
		slctymonth.selectByVisibleText("Sep");
		
		//table claender
		List<WebElement> rows=driver.findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("tr"));
		System.out.println("");
		System.out.println("NO of rows are  "+rows.size());
		
		List<WebElement> colum=rows.get(1).findElements(By.tagName("td"));
		
		System.out.println("NO of columns are  "+colum.size());
	
	for (int r = 1; r <rows.size(); r++) 
	{
		
		List<WebElement> columns=rows.get(r).findElements(By.tagName("td"));
		
		for (WebElement eachcolumns : columns) 
		{
			
			System.out.print(eachcolumns.getText()+" ");
			
			if (eachcolumns.getText().equals("20")) 
			{
				eachcolumns.click();
				
			}
			
			
		}
		
		System.out.println("");
	}
	
	driver.findElement(By.id("flexCheckChecked")).click();
	driver.findElement(By.name("submit")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

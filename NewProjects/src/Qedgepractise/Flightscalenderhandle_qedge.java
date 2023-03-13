package Qedgepractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightscalenderhandle_qedge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://flights.qedgetech.com");
	
		boolean res=driver.findElement(By.className("login-box-msg")).isDisplayed();
		
		
		
	if (res)
	{
		System.out.println("Login page dispalyed, TEST PASS");
	}
	else
	{
		System.out.println("Login page not dispalyed,TEST FAILED    ");
	}
		
		//email ID
	driver.findElement(By.name("email")).sendKeys("md.nihadm@gmail.com");
	//passwrd field
	driver.findElement(By.name("password")).sendKeys("allahu786");	
	//Signin button
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
	
		//code to check login succ or not
String txtofdashboard=driver.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[1]")).getText();
		
		if (txtofdashboard.toLowerCase().contains("dashboard"))
       {
			System.out.println("LOGIN SUCCESFULL, TEST PASS");
		} 
		
		else
		{
			System.out.println("LOGIN FAILED, TEST FAIL");
		}
		
		
		driver.findElement(By.id("search-date")).click();
		
		String urchoiceyear="2026";
		String urchoicemonth="october";
		String urchoicedate="20";
	String txtofyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
	
	        //for  year
		while (!txtofyear.equals(urchoiceyear)) 
		{
			driver.findElement(By.linkText("Next")).click();//button right directions
			txtofyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		
	         String txtofmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		   
	         
	         //for month
	         while(!txtofmonth.toLowerCase().contains(urchoicemonth)) 
		{
		    	driver.findElement(By.linkText("Next")).click();
		    	txtofmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
	        
	         
		
		//for date
     List<WebElement> rows=	driver.findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("tr"));
		
		for(int r=1;r<rows.size();r++) 
		{
			  List<WebElement> columns=rows.get(r).findElements(By.tagName("td"));
			for(int c=0;c<columns.size();c++) 
			{
			String txtcolum=columns.get(c).getText();
				if (txtcolum.equals(urchoicedate)) 
				{
					columns.get(c).click();
					break;
				}
				
			}
			
			
		}
		
		String txtofmonth1 = driver.findElement(By.className("ui-datepicker-month")).getText();
		String txtofyear1=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		if (txtofmonth1.toLowerCase().equals(urchoicemonth)) 
		{
			System.out.println("your Selected month and year is  " +txtofmonth1+txtofyear1 );
		} 
		else 
		{
             System.out.println("month not selected");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

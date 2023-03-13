package FlightReservation.Libraries;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import FlightUtils.AppUtilis;

public class LoginPage extends AppUtilis {

	
	
	public void Login(String EmailID, String Password) 
	{
           driver.findElement(By.name("email")).sendKeys(EmailID);//sending mail ID
           driver.findElement(By.name("password")).sendKeys(Password);//sending Password
           driver.findElement(By.xpath("//button[text()='Sign In']")).click();//clicking on button
          
	
	
	}
	
	
	  
     	public void Logout() 
	{
           driver.findElement(By.xpath("//div/div[3]/ul/li[2]/div/a/i")).click();//click ons settings 
           driver.findElement(By.xpath("//li[2]/div/ul/li[5]/a/i")).click();//clciks logout
           System.out.println("LOGGED OUT");
	}
	
	
	public boolean isHomepageDisplayed()
    {
		
		try 
		{    driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[3]/ul/li[1]/i")).isDisplayed()  ;                               
			System.out.println("HomePage Displayed  TEST PASS");
			return true;
		}
		
		catch (Exception e) 
		{
			System.out.println("HomePage NOTdisplayed  TEST FAIL");
			return false;
		} 
     }
	
	
	
	
	public boolean isErrorMsgDisplayed() 
 {
	
	
	
	 if ( driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/h4[1]")).isDisplayed()) 
	   
	   {
		System.out.println("Alert msged displayed");
		 return true;
	   } 
	 
	 else 
	   {
		 return false;
	   }
	 
	 
				 

	}
	
	
	
	
	
	
	
	
	
	
	
		
}

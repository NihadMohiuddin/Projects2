package Ecommerce.Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Ecommerce.Utils.AppUtils;

public class LoginPage extends AppUtils {

	
	
	//here i didn't developed separate method for isloginmoduledisplayed()
	public boolean Login(String Emailid, String password)
	{    
		
		//click on my acount
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		
		Actions act1=new Actions(driver);
		//clicks on login
		act1.moveToElement(driver.findElement(By.linkText("Login"))).click().perform();
	
	     driver.findElement(By.id("input-email")).sendKeys(Emailid);//passes email id
	     driver.findElement(By.id("input-password")).sendKeys(password);//passes passwrd
	     driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();//clicks on login
	
	   //below code checks whether login successful or not[my account is also present after login]
	        try 
	            {
	        	  
		         driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
			    System.out.println("Logged In");
		         return true;
	            
	            } 
	        
	        catch (Exception e) 
	           {
	        	return false;
			   }
	     
	}
	
	
	//for invalidlogin error msg
	  //below code checks whether invalidlogin errormsg displayer or not 
	public boolean isErrormsgDisplayed() 
	{
	
		boolean errormsgdispalyed=false;
   	if (driver.findElement(By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());
          {
    	   errormsgdispalyed=true;
	      }
	
      return errormsgdispalyed;
	 
	}
	
	

	public boolean Logout()
	{  
		
	
		//click on my acount
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Logout"))).click().perform();//click on logout
		
		try 
		{
			driver.findElement(By.xpath("//h1[text()='Account Logout']")).isDisplayed();
		     System.out.println("Logged out");
		      return true;
		} 
		
		catch (Exception e) 
		{
			 return false;
		}
		
		
		
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package HRM.Libraries;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Apputils;

public class LoginPage extends Apputils {

	
	public void Login(String UserID, String AdminPasswd ) 
	{
		
       driver.findElement(By.id("txtUsername")).sendKeys(UserID);
       driver.findElement(By.id("txtPassword")).sendKeys(AdminPasswd);
	   driver.findElement(By.id("btnLogin")).click();//submit button
	
	
	}
	
	
	public void Logout() 
	{
		
        driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();//logut buton
	}
	
	
	
	
	public boolean IsAdminmoduleDisplayed() 
	{
		 try 
		 {
		driver.findElement(By.id("welcome")).isDisplayed();
		return true;
		 }
		
		 catch (Exception e) 
		 {
			return false;
		 }
		 
     }
	
	
	
	public boolean IserrormsgDisplayed() 
	
	{
		
		
		String txt=driver.findElement(By.id("spanMessage")).getText();
		System.out.println(txt);
		if (txt.toLowerCase().contains("invalid")) 
       {
		return true;
	   } 
       else 
       {
    	   return false;

	   }
		
	     
	
		
		
	}
	
	
	
	
	
}

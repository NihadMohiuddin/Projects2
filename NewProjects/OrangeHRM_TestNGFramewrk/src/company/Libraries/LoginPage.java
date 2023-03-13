package company.Libraries;

import org.openqa.selenium.By;

import company.Utils.AppUtils;

public class LoginPage extends AppUtils {

	
	public void Loginasadmin(String AdminID, String AdminPass) 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(AdminID);
		driver.findElement(By.id("txtPassword")).sendKeys(AdminPass);
		driver.findElement(By.id("btnLogin")).click();//Login Button
	
	}
	
	
	public void Logout() 
	{
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();//clicks on logout
		
	}
	
	
	public boolean isadminModuleDisplayed()

	{
		
		try
		{
		driver.findElement(By.id("welcome")).isDisplayed();
		return true;
		}

		catch (Exception e) 
		{
			return true;
		}
	}
	
	
	

	public boolean isErrormsgDisplayed()
   {
	 try {
	 driver.findElement(By.id("spanMessage")).isDisplayed();
             return true;
	   }
  
   
   catch (Exception e) 
	 {
	   return false;
     }
   
   
   }
	
	
	
	
}

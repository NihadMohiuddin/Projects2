package Json_Project.Libraries;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Json_Project.AppUtils.AppUtils;

public class Loginpage extends AppUtils {

	
	
	@Test(enabled = false)
	public void Login(String username,String Passwrd) 
	{
		
		Actions act1=new Actions(driver);

		//clicks on login symbol 
	   WebElement lgnsymbl=driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]"));
		act1.moveToElement(lgnsymbl).build().perform();//Clicks on login symbol
		
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();//clicks on login
		
		driver.findElement(By.id("Username")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(Passwrd);
		
		//clicks on login btn
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
		//for invalid login
		public boolean isLoginSuccesful()
		{
			WebElement ErrorTxt =driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors' and text()='Login was unsuccessful. Please correct the errors and try again.']"));

			if (ErrorTxt.isDisplayed()) 
			     {  
			    System.out.println("LoginUnsuccesful msg displayed");

				return false;
			     
			     }
			
			else {
			    System.out.println("Login Succesfull");

				return true;
			      }
			
		}
		
		
	
	
	
	
	
	
	
}

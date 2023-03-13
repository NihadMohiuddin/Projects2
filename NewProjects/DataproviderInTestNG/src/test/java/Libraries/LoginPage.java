package Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AppUtils.AppUtils;

public class LoginPage extends AppUtils{
	
	

	public void Login(String username, String password) throws InterruptedException 
	
	{     Actions act=new Actions(driver);
		  WebElement elemt=driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']"));
		
		  
		  WebDriverWait wait=new WebDriverWait(driver, 5);
		  wait.until(ExpectedConditions.visibilityOf(elemt)).click();
		  
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
		
		
		
		driver.findElement(By.id("Username")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}
	
	
	
	
	
	
	
	
	
	
	
}

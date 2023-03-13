package Libraries;

import org.openqa.selenium.By;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;



import Utils.Apputils;

public class Login extends Apputils {

	
	
	@Test
	@Parameters ({"userID","password"})
	
	public void login(String userID,String password)
	
	{
		driver.findElement(By.name("email")).sendKeys(userID);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	
	public void logoout() 

	{
		driver.findElement(By.xpath("//div[3]/ul/li[2]/div/a/i")).click();
		driver.findElement(By.linkText(" Logout")).click();
		
		
	}
	
	
	
	
	
	
	
	
}

package company.Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import company.Utils.AppUtils;

public class Userpage  extends AppUtils {

	public void AddUser(String Employename, String Userename, String passwrd)
	{
	     driver.findElement(By.linkText("Admin")).click();

	     Actions act=new Actions(driver);
	     act.moveToElement(driver.findElement(By.linkText("User Management"))).perform();
	    act.moveToElement(driver.findElement(By.linkText("Users"))).click().perform();
	    
	    driver.findElement(By.id("btnAdd")).click();//button
	   
	    driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Employename);
	    driver.findElement(By.id("systemUser_userName")).sendKeys(Userename);
	    driver.findElement(By.id("systemUser_password")).sendKeys(passwrd);
	    driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(passwrd);
	    driver.findElement(By.id("btnSave")).click();//save buton
	     
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

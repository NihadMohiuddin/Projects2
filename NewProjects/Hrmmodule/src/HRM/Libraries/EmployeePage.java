package HRM.Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Utils.Apputils;

public class EmployeePage extends Apputils

{
	
	
     public void addemployee(String Employname, String Username, String EmployePasswrd) throws InterruptedException 
     { 
	       Actions act=new Actions(driver);
	       act.moveToElement( driver.findElement(By.linkText("Admin"))).perform();
	       act.moveToElement( driver.findElement(By.linkText("User Management"))).perform();
	       act.moveToElement( driver.findElement(By.linkText("Users"))).click().perform();
	      
	       driver.findElement(By.id("btnAdd")).click();
	      
	       driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Employname);//sending employe name
	       driver.findElement(By.id("systemUser_userName")).sendKeys(Username);//sending user name
	       driver.findElement(By.id("systemUser_password")).sendKeys(EmployePasswrd);
	       driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(EmployePasswrd);
            Thread.sleep(2000);
	       driver.findElement(By.id("btnSave")).click();//save button
     
	      
     
     
     
     }
	
	
	
	
	
}

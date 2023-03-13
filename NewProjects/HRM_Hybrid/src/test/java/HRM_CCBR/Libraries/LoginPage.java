package HRM_CCBR.Libraries;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HRM_CCBR.Utils.Apputils;

public class LoginPage  extends Apputils{

	
	
	
	
	@FindBy(id = "txtUsername")
	WebElement username_Elmnt;
	
	
	@FindBy(id = "txtPassword")
	WebElement Password_Elmnt;
	
	@FindBy(id = "btnLogin")
	WebElement Loginbtn_Elmnt;
	
	@FindBy(id = "welcome")
	WebElement Welcome_Elmnt;
	
	@FindBy(linkText ="Logout")
	WebElement Logut_Elmnt;
	
	
	@FindBy(id="spanMessage")
	WebElement error;
	
	@FindBy(xpath = "//span[contains(text(),'Invalid credentials') or contains(text(),'Username cannot be empty') or contains(text(),'Password cannot be empty')  ]")
	WebElement errormsg_Elmnt;
	
	
	
	
	
	
	
	@FindBy(xpath="//b[normalize-space()='Admin']")
	WebElement Admin_Elmnt;
	
	
	

	
	
	
	public void  Login (String Usname,String Pass) 
	{	
         
        username_Elmnt.sendKeys(Usname);
		Password_Elmnt.sendKeys(Pass);
		Loginbtn_Elmnt.click();
		
	}
		
	
	public boolean IsLoginSuccefull() 
	{
		
		try 
		{   Welcome_Elmnt.isDisplayed();
		     return true;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return false;
		}
		
		

	}
	
	      
		
	  
	
	
	
	public boolean isErrormsgDisplayed()
	{
		
	
		
		try 
		{
			errormsg_Elmnt.isDisplayed();
		      return true;
		} 
		catch (Exception e)
		{  System.out.println(e);
			return false;
		}
		
	}
	
	
	public String errormsg()
	{
		String x=error.getText();
      return x;
	}
	
	
	
	public boolean logout()
	{
		try 
		{
			Welcome_Elmnt.click();
			Logut_Elmnt.click();
			Loginbtn_Elmnt.isDisplayed();//this btn present only in login.
			return true;
		} 
		
		catch (Exception e) 
		{
			System.err.println(e);
			return false;
		}
		
			
	
		
	}
	
	
	
	public boolean isEmployeeModuleDisplayed() 
	{
		
		try 
		{
			Admin_Elmnt.isDisplayed();
			return false;
		
		
		} 
		catch (Exception e)
		{
			return true;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

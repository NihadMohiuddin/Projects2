package Json_Project.Libraries;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Json_Project.AppUtils.AppUtils;

public class RegisterationPage extends AppUtils {

	
	
	
	public void Newregisteration(String Fname, String LName, String Email, String ConfrmEmail, String Username, String Password, String ConfrmPassword) 
	{      Actions act=new Actions(driver);
		//clicks on login symbol
	
	
     WebElement lgnsymbl=driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]"));
		act.moveToElement(lgnsymbl).build().perform();
		
        //clicks on register
		driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(Fname);
		
		driver.findElement(By.id("LastName")).sendKeys(LName);

		driver.findElement(By.id("Email")).sendKeys(Email);
	
	    driver.findElement(By.id("ConfirmEmail")).sendKeys(ConfrmEmail);
	
	    driver.findElement(By.id("Username")).sendKeys(Username);
	    
	    driver.findElement(By.id("check-availability-button")).click(); //USername Avaible btn
	   
	    Select slct1=new Select(driver.findElement(By.id("Details_CompanyIndustryId" )));
		Select slct2=new Select( driver.findElement(By.name("CountryId")));
	   
	    slct2.selectByVisibleText("United States");//Dropdown for country selction
	    
	    driver.findElement(By.id("Password")).sendKeys(Password);

	    driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfrmPassword);

	      System.out.println("Totak no of dropdowns  "+slct1.getOptions().size());
	     slct1.selectByVisibleText("I am student");//Dropdown for Company selction
	    
	     driver.findElement(By.id("register-button")).click();
	    
	     
	     WebElement RegistrionSuccTxt=driver.findElement(By.xpath("//h2[contains(text(),'Almost done! To complete your nopCommerce registration')]"));
	     
	     
	     
	     
	     
	     
	     if (RegistrionSuccTxt.isDisplayed())
	        {
	    	 //here without changing method void into boolena return type we can direclty use assert here
			   assertTrue(true);
		   System.out.println("REGISTERATION SUCCESSFUL");
	        
	        } 
	     
	     else
		     {
	    	 assertTrue(false);
	    	  System.out.println("REGISTERATION FAILED");
		     }
	     
	     
	     
	     
	}
	
	
	
	
	
	
	
	
	
}

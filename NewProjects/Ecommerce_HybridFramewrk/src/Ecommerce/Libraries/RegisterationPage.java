package Ecommerce.Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Ecommerce.Utils.AppUtils;
import net.bytebuddy.utility.RandomString;

public class RegisterationPage extends AppUtils {

	
	

     public boolean NewRegisteration(String firstname, String lastname, String emailid, String Mobileno, String password, String Conformpassword)
	{
		 
		 Actions act=new Actions(driver);
	    driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	   
	    act.moveToElement(driver.findElement(By.linkText("Register"))).click().perform();
       
	    driver.findElement(By.id("input-firstname")).sendKeys(firstname);
    	driver.findElement(By.id("input-lastname")).sendKeys(lastname);
    	driver.findElement(By.id("input-email")).sendKeys(emailid);
	    driver.findElement(By.id("input-telephone")).sendKeys(Mobileno);
	    driver.findElement(By.id("input-password")).sendKeys(password);
	    driver.findElement(By.id("input-confirm")).sendKeys(Conformpassword);
	    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();//clicks checkbox
	    driver.findElement(By.xpath("//*[@value=\"Continue\"]")).click();//clicks button
	
	 
	     //"account created" msg element returns boolean
	    String x= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
	    System.out.println("Registerd succesfull msg "+ x);
	  
	     
	           if (x.equalsIgnoreCase("Your Account Has Been Created!")) 
	    	     {
			       return true;
		         }
	        
	           else 
	            {
	             return false;
	    	   
	            }
	   
	   }
	    
         //for InvalidRegisteration error msg
	      public boolean IsErrormsgDisplayed()
	          {
	    	//for such type of logic copy xpath and paste and check in browser for conformtion
	    	  //below element is present  in invalid regist page not after registering
	    	
	    	  if(driver.findElement(By.xpath("//*[@id=\"content\"]/h1[text()='Register Account']")).isDisplayed())
	    	       {
	    		 
	    		 return true;
	    		 
	    	       }
	    	  else {
	    	      return false;
	    	       }
     
	          }
     
   
     
     
     
     
	    
	}
	
	
	
	
	
	
   
	
	
	
	
	
	
	


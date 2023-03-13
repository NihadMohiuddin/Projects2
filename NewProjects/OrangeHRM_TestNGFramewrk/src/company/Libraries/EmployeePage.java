package company.Libraries;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import company.Utils.AppUtils;

public class EmployeePage  extends AppUtils{

	
	public boolean addemploye(String Firstname, String Lasttname) 
	{
		
       driver.findElement(By.linkText("PIM")).click();
       driver.findElement(By.linkText("Add Employee")).click();
       driver.findElement(By.id("firstName")).sendKeys(Firstname);
       driver.findElement(By.id("lastName")).sendKeys(Lasttname);
    String txtId= driver.findElement(By.id("employeeId")).getAttribute("value");
       driver.findElement(By.id("btnSave")).click();
       driver.findElement(By.linkText("Employee List")).click();
       
       driver.findElement(By.id("empsearch_id")).sendKeys(txtId);
       
       driver.findElement(By.id("searchBtn")).click();
       
       
List<WebElement> rows= driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
List<WebElement> colum=rows.get(1).findElements(By.tagName("td"));
       String txt=colum.get(1).getText();
       try  
       {
    	   txt.equals(txtId);
    	   return true;
	   } 
       catch (Exception e) 
       {
    	   return false;
     	} 
	  
       
       
       
       
       
       
       
       
       
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

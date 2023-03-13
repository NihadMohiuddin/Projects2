package Qedgepractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_Qedge {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         WebDriver driver;
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://cosmocode.io/automation-practice-webtable/");
         //to find no of rows
         List<WebElement> rows=driver.findElement(By.id("countries")).findElements(By.tagName("tr"));
         System.out.println("No of rows in table are  "+rows.size()); 
	
         //to find no of columns
	    //as we know tr has td's, by going into single tr and find all td's we can find columns
           List<WebElement> col= rows.get(1).findElements(By.tagName("td"));
           System.out.println("No of columns in table are  "+col.size());
	         
           
	    	  System.out.println("");
	    	  
	      //to get data from table
	
	      for (int r=1;r<rows.size();r++) {
	    	  List<WebElement> columns =rows.get(r).findElements(By.tagName("td"));
	            
	    	  for (WebElement columndata : columns) {
	    		  String data= columndata.getText();
	    		  System.out.print(data+"  ");
	    		  
	    		  
	                   }
	    	  
	    	  System.out.println("");
	    	  
	      }
	
//------------------------------------------------------------------------------------------------	
	
	 
	
	
	}

}

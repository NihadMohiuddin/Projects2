package OldPackages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

public static void main(String[] args) {


	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
	
	           WebDriver driver;
	           driver=new ChromeDriver();
	           driver.manage().deleteAllCookies();
	           driver.manage().window().maximize();
	           driver.get("https://www.w3schools.com/html/html_tables.asp");
	           
	           
	           //for printing columns count
	           List<WebElement> Columscount =driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//th"));
	            System.out.println( "No of columns are  "  + Columscount.size());
	         
	            
	            //for printing Rows count
	            List<WebElement> rowscount=driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tr"));
	                
               System.out.println( "No of rows are  "+ rowscount.size());
	
	
	 	      
	                    //to print all
		       
		      /*
	            for(int r=2;r<=rowscount.size();r++ ) {    //r=2,3,4,5,6,7
		           
	            	
	            	for (int c=1;c<=Columscount.size();c++) {
	            		
	            		
	     WebElement allelements=driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr["+r+"]/td["+c+"]"));
	    	System.out.print( allelements.getText() +   "    ");
	    	
	            	}
	            System.out.println();
	            
         	}
	*/
                   	// for printing specific value and also get that values rows and column number
	            for (int r=2;r<=rowscount.size();r++) {
	            	
	            	for(int c=1;c<=Columscount.size();c++) {
	            		
	           	     WebElement allelements2=driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr["+r+"]/td["+c+"]"));
	           	     String text=allelements2.getText();
	           	  if(text.equalsIgnoreCase("Island Trading")) 
	           	     {
	           	    	 System.out.println("the " + text+ "  value is presnt in row : column  = " + r +  ":" + c);
	           	    	 break; 
	           	     }
	           	     
	            	
	            	}
	            	System.out.println();
	            	
	            	
	            }
	            
	            
	            
	            
	            
}
	
	
}
	
	
	
	
	
	
	
	


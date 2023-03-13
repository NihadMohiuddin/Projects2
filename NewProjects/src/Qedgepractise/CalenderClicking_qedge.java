package Qedgepractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderClicking_qedge {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 WebDriver driver;
     driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      driver.get("https://www.irctc.co.in/nget/train-search");
	
          //clciked on OK button small window
      driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
      //clicked on dd/mm/yy box
     driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
     
      Thread.sleep(2000);
      WebElement table=driver.findElement(By.className("ng-tns-c58-10"));
      List<WebElement> rows=  table.findElements(By.tagName("tr"));
	   System.out.println("No Of ROWS are  "+rows.size());
	   
	   List<WebElement> column1=rows.get(1).findElements(By.tagName("td"));
	    System.out.println("No Of Columns are   "+column1.size());
	     
	    String dob = "28-Sep-1990";
		String[] temp = dob.split("-");
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
	  // String givendate="16";
	            

		for(int r=1;r<rows.size();r++) {
	       List<WebElement> column=rows.get(r).findElements(By.tagName("td"));
	                
	             for (WebElement eachcolum : column) 
	             {
	            	
	            	 if( eachcolum.getText().equals(dt)) 
	            	 {
	            		 Thread.sleep(2000);
	            		 eachcolum.click();
	            		 System.out.println(eachcolum.getText());
	            	    System.out.println("clicked on given date");
	            	          break;
	                      }
	            }
		
	             
	             
	             
	             
	             
	             
	             
	              }
	            
	            
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}

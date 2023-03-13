package Qedgepractise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSelectedRowsndColum_Qedge {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       WebDriver driver;
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.railyatri.in/time-table");
		
     WebElement table=driver.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div/div/div/div/table"));
     List<WebElement> rows = table.findElements(By.tagName("tr"));
     System.out.println("No of rows in table are  "+rows.size());
     List<WebElement> col=rows.get(1).findElements(By.tagName("td"));
     System.out.println("No of columns in table are  "+col.size());	
     System.out.println("");
     
     //code to read all data
	 for (int r =1; r < rows.size();r++) {
		
   List<WebElement> datainrow= rows.get(r).findElements(By.tagName("td"));
    	 
    	 for (WebElement eachdatainrow : datainrow) {
    		System.out.print(eachdatainrow.getText()+ "      "); 
    	}
    
    	 System.out.println("");
    	 
    	 
	}
	 System.out.println("");
	 System.out.println("");
	 System.out.println("");
   //---------------------------------------------------------               
	  //code only to capture first two columns 
		
		
	 for (int r =1; r < rows.size();r++) {
			
		   List<WebElement> columdata= rows.get(r).findElements(By.tagName("td"));
		    	 
		    	 for(int c=0;c<=1;c++) {
		    		 
		    		System.out.print(columdata.get(c).getText()+"    "); 
		    	 
		    	 }
		    	 
		    	 System.out.println(" " );
		    	 
		    	 
		    	 }
		    
		    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

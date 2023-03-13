package Qedgepractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class DopdownPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         WebDriver driver;
         driver=new ChromeDriver();
          driver.manage().window().maximize();
 	      driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
          
 	      Select  slct=new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
 	   List<WebElement> dropdwn =slct.getOptions();
 	     System.out.println( dropdwn.size());
             
 	    
           for(WebElement each:dropdwn) {
        	 String txt =  each.getText();
        	  System.out.println( txt);
           }
        	  System.out.println("");
        	  String slectdname="Yemghfgen";
             	boolean bolen=false;
        	    for(WebElement each1:dropdwn) {
        		  String txt1 =  each1.getText();
        		
        		  if(txt1.equalsIgnoreCase(slectdname)) {
                  bolen=true;
                 break;
                }
                 }
        	  
           if (bolen) {
			System.out.println("item is present");
		}
           else {
        	   System.out.println("item not present");
		}
	
	}	
}

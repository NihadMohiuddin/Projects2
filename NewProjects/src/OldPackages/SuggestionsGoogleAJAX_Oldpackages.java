package OldPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionsGoogleAJAX_Oldpackages {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
			
			WebDriver driver;
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://in.search.yahoo.com/?fr2=inr");
		    driver.findElement(By.name("p")).sendKeys("testing job");
			Thread.sleep(2000);
			
List<WebElement>sugg=driver.findElement(By.xpath("//*[@id=\"sbq-wrap\"]/div/div/div")).findElements(By.tagName("li"));

    System.out.println("total no of suggestions  "+sugg.size());
    System.out.println();
    String elemnttocheck="testing  in hyderabad";
  
     
      boolean ifclicked=false;
      for (WebElement eachsugg : sugg) {
	  String txt= eachsugg.getText();
	 System.out.println(txt);
	 System.out.println();
	 if(txt.equalsIgnoreCase(elemnttocheck)) {
	  eachsugg.click();
	  ifclicked=true;
	  break;
           
	       }
	 
	  }
      
      if (ifclicked) {
		System.out.println("element available & clicked sucefully Test Passed");
	           }
      else {
    	  System.out.println("element NOT present so  clicked Failed");
	       }
	
	
	
	
	}
}

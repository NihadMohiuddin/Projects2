package Qedgepractise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class GoogleAJAX_suggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiXl7eZt9P6AhWJyXMBHa3YAI8QPAgI");
	    driver.findElement(By.name("q")).sendKeys("Seleneium");
		Thread.sleep(2000);
	 //List  <WebElement> suggestions= driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li"));
		//                         OR with find elemtnt and find elemnts
	 List  <WebElement> suggestions= driver.findElement(By.xpath("//ul[@jsname='bw4e9b']")).findElements(By.tagName("li"));

	 System.out.println(suggestions.size());
	 String Dynamicvalue="Selenium ide";
	 for (WebElement eachsugges : suggestions) {
		 String txt=eachsugges.getText();
		 System.out.println(txt);
		
		 
		if(txt.equalsIgnoreCase(Dynamicvalue)) {
			 eachsugges.click();
			 System.out.println("specifc elemnt is present");
			 System.out.println();
			 break;
		 }
	}
	 
	 
	 //------------------------------------------------------------------------------------------------
	  
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	}



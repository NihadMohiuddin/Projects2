package PractisingOldPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsCopypaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver;
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.diffchecker.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Use web version instead")).click();
	    
         
	    WebElement txtbox=driver.findElement(By.xpath("//div/form/div[1]/div[1]/div[2]/div"));
		
		
		
	Actions act=new Actions(driver);
	act.moveToElement(txtbox).sendKeys("fhjgsdgdfgfhgdghdgfhdghhjkgh").perform();
	
	act.keyDown(txtbox, Keys.CONTROL).sendKeys("a").sendKeys("x").perform();
	
		Thread.sleep(2000);
		 WebElement txtbox2	=driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/div[2]/div[2]"));
       act.moveToElement(txtbox2).keyDown(txtbox2, Keys.CONTROL).sendKeys("v").perform();
       
		
	}
	
	
	
	
	
	
	
	
	
	
}

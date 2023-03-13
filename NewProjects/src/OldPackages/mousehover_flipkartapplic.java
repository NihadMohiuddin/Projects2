package OldPackages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class mousehover_flipkartapplic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		WebElement xBUTTON=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		xBUTTON.click();
		
		WebElement fashion=driver.findElement(By.xpath("//div[@class=\"xtXmba\"][text()='Fashion']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		
		
		WebElement menfootwear=driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		act.moveToElement(menfootwear).perform();
		
		WebElement mentShirt=driver.findElement(By.xpath("//a[@class=\"_6WOcW9 _3YpNQe\"][2]"));
		mentShirt.click();
		
		
		
		
		
		
		
		
	}

	}

	
	
	
	
	
	
	


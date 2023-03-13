package Qedgepractise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import OldPackages.actions_sendkeysmethods;

public class CheckboxDropdown_Qedge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3.org/WAI/ARIA/apg/example-index/checkbox/checkbox");
		
		Actions act=new Actions(driver);
	//	act.sendKeys(Keys.PAGE_DOWN).perform();
		
    List<WebElement> list=driver.findElements(By.xpath("//ul[@class='checkboxes']/li"));
	System.out.println(list.size());
	
	Thread.sleep(2000);
	
	for(int i=0;i<list.size();i++) 
	{
		System.out.println(list.get(i).getText());
        list.get(i).click();
	    Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	}
}

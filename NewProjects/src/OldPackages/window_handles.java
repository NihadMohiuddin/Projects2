package OldPackages;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window_handles {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hp.com/in-en/shop/");
	
	
	WebElement hp_forbusinessimage=driver.findElement(By.xpath("//FIGURE[@class='home-category-event-freature new-home-page-featuredoffers-block-img' and @data-pb-style=\"O0V6ERO\"]"));
	hp_forbusinessimage.click();//opens other window
	
	
	WebElement fb_linkwindow=driver.findElement(By.xpath("//a[@class=\"fa fa-facebook\"]"));
	fb_linkwindow.click();//open fb in other window
	
	WebElement youtubewindow=driver.findElement(By.xpath("//a[@class=\"fa fa-youtube-play\"]"));
	youtubewindow.click();//opens yutbe in other wind
	
	WebElement pintrestwindow=driver.findElement(By.xpath("//a[@class=\"fa fa-pinterest-p\"]"));
	pintrestwindow.click();//opens pintrst in other wind
	
    
	 Thread.sleep(3000);
	 
	 Set<String> allwindows1=driver.getWindowHandles();
	 List<String> all_windws2=new ArrayList<String>(allwindows1);
	 
	   // String windows1= all_windws2.get(0);
		//driver.switchTo().window(windows1);
		
		//using for each loop for printing titles and also for swirch to desired windows using if  HP India - YouTube
		
	     for (String window:allwindows1) {
		//get title method present in driver interface 
		 
		String title=driver.switchTo().window(window).getTitle();
		System.out.println(title);
			if(title.equalsIgnoreCase("Hewlett Packard (hewlettpackard) - Profile | Pinterest")) {
				//driver.switchTo().window(title);
				continue;
				
				
			}
	
		
	     }			
		/*
	      //using for loop
	        for(int i=0;i<all_windws2.size();i++) {
			String respective_wind=all_windws2.get(i);
			driver.switchTo().window(respective_wind);
		String title=driver.getTitle();	
	//	System.out.println(title);
			if(title.equalsIgnoreCase("HP India - Home | Facebook")){
		driver.switchTo().window(title);
		
			}		
	
		}



*/


		
	
}
		
	
}




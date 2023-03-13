package OldPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsmouse_operations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button1 =driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
		

		//FOR RIGHT CLICKING
		Actions act=new Actions(driver);
     	Thread.sleep(3000);

	    act.contextClick(button1).perform();
	    driver.findElement(By.xpath("//*[text()='Edit']")).click();
	 
     	Thread.sleep(3000);

		//to accept the alert
     	driver.switchTo().alert().accept();
     	//FOR DOUBLE CLICKING
     	WebElement button2 =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     	Thread.sleep(2000);
       
     	
     	act.doubleClick(button2).perform();
     	
     	
     	

		
		
	
		
		
	}
	
	
	
	
	
	
	
	
}	


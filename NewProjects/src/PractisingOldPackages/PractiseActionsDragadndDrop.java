package PractisingOldPackages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseActionsDragadndDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	
		Thread.sleep(2000);
	WebElement source=	driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement target=driver.findElement(By.xpath("//div[@id=\"column-2\"]"));

	Actions act=new Actions( driver);
	Thread.sleep(2000);
		act.dragAndDrop(source, target).build().perform();
	
//--------------------------------------------------------------------------------------------		
	//with other website
		
		/*	
	driver.get("https://demo.guru99.com/test/drag_drop.html");

WebElement source1=	driver.findElement(By.xpath("//a[text()=' BANK ']"));
WebElement target1=driver.findElement(By.xpath("//ol[@id='bank']//li[@class=\"placeholder\"]"));	
Actions act=new Actions( driver);
Thread.sleep(2000);
act.dragAndDrop(source1, target1).perform();
		
		
		*/
		
		// TODO Auto-generated method stub

	}

}

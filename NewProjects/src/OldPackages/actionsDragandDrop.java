package OldPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import graphql.ThreadSafe;

public class actionsDragandDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	//PRESENT IN FRAME SO SWITCHING FIRST IN TO THISFRAME
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
	
	WebElement sourc=driver.findElement(By.id("draggable"));
	WebElement targ=driver.findElement(By.id("droppable"));

	Actions act=new Actions(driver);
      Thread.sleep(2000);

	//NEED TO GIVE SOURCE AND TARGET AS WEBELEMENT.this method ask us to give source and target as argumtents
	act.dragAndDrop(sourc, targ).perform();
	//----------------------------------------------------------------------------------------------------------------------------
 
	//	OTHER SITE PRACTISE
	 Thread.sleep(2000);
	 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	 Thread.sleep(2000);

	 WebElement sourc1=driver.findElement(By.id("box1"));
	 WebElement targ2=driver.findElement(By.id("box101"));

	 Actions act1=new Actions(driver);
	 act.dragAndDrop(sourc1, targ2).perform();
	 Thread.sleep(2000);
	
	 //--------------------------------------------------------------------------------------------------------------------------
	 
	 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	 
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']")));
	 WebElement sourc_1=driver.findElement(By.xpath("//h5[text()='High Tatras 2']//following-sibling::img"));
	 WebElement sourc_2=driver.findElement(By.id("trash"));
	 Thread.sleep(2000);

     act.dragAndDrop(sourc_1, sourc_2).perform();

	
	 
}
	
	
	
}


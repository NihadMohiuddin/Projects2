package OldPackages;

import java.lang.reflect.Method;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_sendkeysmethods {
	
	

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	WebDriver driver;
	driver=new ChromeDriver();
	
	
	
	driver.manage().window().maximize();
	driver.get("https://text-compare.com/");
	
	
	
	WebElement box1=driver.findElement(By.id("inputText1"));
	 
	
	WebElement box2=driver.findElement(By.xpath("//textarea [@name='text2' and @id='inputText2']"));
	
	
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	//act.sendKeys(Keys.PAGE_DOWN).build().perform();

	 box1.sendKeys("hai world");
	

	//KEYDOWN FOR DOUBLE KEYS opertions  eg:control+a (when using keydown[holds by pressing cntrl] after it use keyup[releases key cntrl] )
	//ctrl+A,ctrl+c
	 //KEYSDOWN.(WEBELEMTN.KEYS,CONTROL) IS ANOTHER METHOD
	 act.moveToElement(box1).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	 Thread.sleep(2000);
   //tab for moving to other box

	 act.sendKeys(Keys.TAB);
	 
	//ctrl+V (pasting)
    act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
	 //new site testing
  // ---------------------------------------------------------------------------------------------------------------------------------------------------
 
    
    driver.get("https://extendsclass.com/text-compare.html");
    Thread.sleep(2000);
    WebElement textbox1=driver.findElement(By.xpath("//span[text()='and differences will be highlighted, ' and @role='presentation']"));
   //another method of keysdown [keys.xxxx .xxx=what ever present in keybard buttons come here]
    act.keyDown(textbox1, Keys.CONTROL).sendKeys("a").sendKeys("x").build().perform();
    Thread.sleep(2000);
    WebElement textbox2=driver.findElement(By.xpath("//span[text()='File comparison can be very difficult, ']"));
    act.keyDown(textbox2, Keys.CONTROL).sendKeys("a").sendKeys("v").perform();

    
   
    
}
}

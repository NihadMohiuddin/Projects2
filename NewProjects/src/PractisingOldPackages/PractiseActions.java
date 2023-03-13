package PractisingOldPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseActions {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	WebDriver driver;
	driver=new ChromeDriver();
    driver.manage().window().maximize();
	
	driver.get("https://text-compare.com/");
	
	WebElement Textbox1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
	 WebElement Textbox2=driver.findElement(By.id("inputText2"));
	
	 
	 Textbox1.sendKeys("IM THE KING IN SELENIUM");
	 Thread.sleep(2000);
	Actions act=new Actions(driver);
   act.moveToElement(Textbox1).keyDown(Textbox1, Keys.CONTROL).sendKeys("a").sendKeys("x").perform();
	act.keyDown(Textbox2, Keys.CONTROL).sendKeys("v").perform();
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}

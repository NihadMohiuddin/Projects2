package PractisingOldPackages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWebdriver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
               WebDriver driver;
               driver=new  ChromeDriver();
               driver.get("https://www.panasonic.com/in/");
               driver.manage().window().maximize();
               
               TakesScreenshot SS=(TakesScreenshot)driver;
               //below code generates SS and stores in java memory so we need to bring that SS into our local storage
               File file= SS.getScreenshotAs(OutputType.FILE);// CREATed FOLDER without code so createnewfile (); not usedi have given path
               File path=new File(".//Screenshotspics//panasonic.png");
               FileHandler.copy(file, path);
          
		//---------------------------------------------------------------
          
		//weblement   SS
		
               Actions act=new Actions(driver);
             
               act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
         
               WebElement element=driver.findElement(By.xpath("//body/div[2]/div[2]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/a[1]/div[1]/div[2]"));
	         act.moveToElement(element).perform();
               File elementSS=element.getScreenshotAs(OutputType.FILE);
		     File path1=new File(".//Screenshotspics//weblementss.png");
		     FileHandler.copy(elementSS, path1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void file(String string) {
		// TODO Auto-generated method stub
		
	}

}

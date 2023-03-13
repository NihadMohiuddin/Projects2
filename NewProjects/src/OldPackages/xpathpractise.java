package OldPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpathpractise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.boat-lifestyle.com/?utm_source=affiliates&utm_medium=Optimise&utm_campaign=Optimise_jan2021");
        WebElement image=driver.findElement(By.xpath("//img[@style='max-width:24px']"));
        image.click();
		WebElement lgnbtn=driver.findElement(By.xpath("//a[text()='Login']"));
		lgnbtn.click();
        WebElement creatacount=driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
        creatacount.click();
    Thread.sleep(2000);
    
        WebElement firstnam=driver.findElement(By.id("customer[first_name]"));
        firstnam.sendKeys("nihad");
     
        //TARTGET IS PASWORD SECTION SOURCE IS CUSTOMER TEXT BOX
        WebElement paswrdenter=driver.findElement(By.xpath("//input[@id='customer[last_name]']//following::input[2]"));
        paswrdenter.sendKeys("mmmmsdsifh");
     
        Thread.sleep(2000);
//USED ACTONS FOR MOVING DOWN FOR CLICKING ON LINKEDIN BUTTON
       Actions act=new Actions(driver);
       act.sendKeys(Keys.PAGE_DOWN).perform();
       act.sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);


     //SOURCE ELEMENT IS SHOP AND TARGET ELEMNT IS LINKED IN
        WebElement linkedin=driver.findElement(By.xpath("//div[@class='footer__item footer__item--links ']/p[contains(text(),'Shop')]//preceding::a[@aria-label='Follow us on LinkedIn']"));
        linkedin.click();
        
        
        
        
        
        
	}
	
	

}

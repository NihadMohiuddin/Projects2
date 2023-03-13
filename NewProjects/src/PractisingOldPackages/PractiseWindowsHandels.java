package PractisingOldPackages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Set;

public class PractiseWindowsHandels {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rog.asus.com/in/");
		
	    WebElement sevices=	driver.findElement(By.xpath("//span[text()='Service']"));
		
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(sevices).perform();
		
		WebElement CheckRepair=	driver.findElement(By.linkText("Check Repair Status"));
		CheckRepair.click();//by clicking this opens new window
		Thread.sleep(1000);

       
        
		
		
		Set<String> windws=driver.getWindowHandles();//windowhandle-returns parent wind while window handles reutn all opened windows
		
		
	
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(windws);
		
		//String childwind=al.get(1);
		//driver.switchTo().window(childwind);
		
		String parentwind=al.get(0); // "driver.switchTo().window(al.get(0)) also can be use"
		
		driver.switchTo().window(parentwind);
		
	     //WebElement textfieldinwind2=driver.findElement(By.xpath("//input[@id=\"RMA No.\"]"));
		//textfieldinwind2.sendKeys("58789555547877812%^$^");
		
		
		act.moveToElement(sevices).perform();
		
        WebElement servicelocation=	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[5]/div[2]/div/ul/li/ul/li[2]/a"));
        servicelocation.click();//by clicking this opens new window
		
        
        driver.switchTo().window(al.get(0));//to switch again to parent windw
       
        act.moveToElement(sevices).perform();
        Thread.sleep(2000);
        
        WebElement WarrantyStatus=	driver.findElement(By.xpath("//a[contains(text() ,'Warranty Status')  and@tabindex=\"0\" ]"));
        WarrantyStatus.click();
       
        
       Set<String> allwind= driver.getWindowHandles();
        
        
      
		for (String eachwindw:allwind) {
			driver.switchTo().window(eachwindw);
		String title=driver.getTitle();
			System.out.println(title);
			//"title.Contains" is case sensitive please take care
			if (title.contains("ROG - Republic of Gamers")) {
			driver.switchTo().window(title);
			break;
			
		}
		
		
	}
	}
}

package OldPackages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		//for click on slectred checkbox
		WebElement clickone_checkbox=driver.findElement(By.xpath("//input[@type=\"checkbox\"] [@name=\"color\"][2]"));
		clickone_checkbox.click();//CLICKS ON YELOW CHECKBOX
	
	
	    Boolean b=	clickone_checkbox.isSelected();
		if(b) {
		
		System.out.println("Sucessfully clicked on yellow checkbox" );
	
		}
		clickone_checkbox.click();//again used becuse for clicking all for below code

		/*
		//for clicking on all checkboxes
	
		List<WebElement> allcheckboxes=driver.findElements(By.xpath("//form/input[@type=\"checkbox\"]"));
		
		for(WebElement eachcheckbox:allcheckboxes) {
			eachcheckbox.click();
		System.out.println("Each checkbox value is  "  +  eachcheckbox.getAttribute("value"));	
			
		}
	
	
		*/
		
		//for clicking on particlular checkbox
		
    List<WebElement> clickon_particular=driver.findElements(By.xpath("//form/input[@type=\"checkbox\"]"));
		
		for(WebElement eachcheckbox:clickon_particular) {
			
			String value=eachcheckbox.getAttribute("value");
			System.out.println(value);
			if(value.equalsIgnoreCase("orange")) {
				
				eachcheckbox.click();
			if(	eachcheckbox.isSelected()) {
				
				System.out.println("purple is clicked");
				
			}
				
			}
		
		
			
		}
		
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	}


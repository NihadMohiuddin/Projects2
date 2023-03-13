package PractisingOldPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractisedropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
   WebElement dropdown=driver.findElement(By.xpath("//select[@class=\"custom-select\"]"));
   Thread.sleep(2000);
	
	Select select=new Select(dropdown);
	List <WebElement>alldropdowns=select.getOptions();//***GETOPTIONS METHOD FOR GETTING COUNT and also can print in list form *****
	
	System.out.println("The count of items in dropdown are  " + alldropdowns.size());//count of items
	System.out.println();
	
	//for printing text of each drop down
	for(WebElement singledropdown:alldropdowns) {
		System.out.println(singledropdown.getText());
	}
	
	
	
	//select.selectByIndex(4);
	
	//select.selectByVisibleText("Sweden");
	//select.selectByValue("6");
			
	//for selcting specific value 
	Thread.sleep(2000);
	for(WebElement singledropdown:alldropdowns) {
		String text=singledropdown.getText();
		if(text.equalsIgnoreCase("Turkey")) {
			
			select.selectByVisibleText(text);
			break;
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
}

package PractisingOldPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseCheckbox_AndRADIObuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//clicking on all checkboxes & getting there text
		List<WebElement> alldays=driver.findElements(By.xpath("//input[ @class=\"form-check-input\"] [@type=\"checkbox\"]"));
		for(int i=0;i<alldays.size();i++){
			
			alldays.get(i).click();
			String textofdays=alldays.get(i).getAttribute("id");
		System.out.println("The days in a week are  "+ textofdays);
			
		}
		
		
		
		//for deslecting the clicked check box slowly with sleep method
		for(int i=0;i<alldays.size();i++){
			alldays.get(i).click();
	     Thread.sleep(1000);
                    }
	
		
	/*
		//for selecting specific value
		
		for(int i=0;i<alldays.size();i++) {
			
			String value=alldays.get(i).getAttribute("id");
			if(value.equalsIgnoreCase("Thursday") ||value.equalsIgnoreCase("tuesday")) {
			WebElement click=	alldays.get(i);
				click.click();
	                  	}
	                }
		
		System.out.println();
		System.out.println();
		
	*/
		
		System.out.println();
		System.out.println();
		
		
		//for selecting LAST TWO/three check boxes [FORMULA= TOTAL checkboxs -no of checkbox want to select] start index from there
		int totalcheckbox=alldays.size();
		for(int i=totalcheckbox-3;i<alldays.size();i++) {
			alldays.get(i).click();
		String selectedboxstext	=alldays.get(i).getAttribute("id");
			System.out.println("Checkbox which are selected are " +  selectedboxstext);
	                  	}
		
		
		
		System.out.println();
		System.out.println();
		
		
		//for selecting first TWO check boxes
		for(int i=0;i<2;i++) {
			alldays.get(i).click();
			
	               }
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		
//-------------------------------------------------------------------------------------------------------		
		
		// selecting all radiobuttons ***cannot s all radio buttons * diff btween radio and check boxes are 
	List <WebElement>allradiobuttons=driver.findElements(By.xpath("//label[contains(@for,'year')]"));
		
	System.out.println("The no of radio buttons present are   "+ allradiobuttons.size());
		
		
		
		
		
		
		
		
		
		
	
	}	
}

package Qedgepractise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
		
		Select slct =new Select(driver.findElement(By.id("demo_native")));
		
		List <WebElement> allitems=slct.getOptions();
		System.out.println(allitems.size());
		System.out.println("");
		
		String itemtoselect="jf";
		boolean bolean=false;
		
		for(WebElement eachelmnt :allitems) {
			String txt=eachelmnt.getText();
			
		
		if (txt.equalsIgnoreCase(itemtoselect)) {
			
			bolean=true;
			break;
	}               //for each is a loop it continues prints in else block i.e(syso["specified item repetdly prints for all"]) also so we creatred other if ,else outsode for
		}	
		if (bolean) {
			System.out.println("specified item is present");
		}
		
		else {
			System.out.println("specified item is NOTPresent");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
//------------------------------------------------------------------	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(2000);
	Select slct1=new Select(driver.findElement(By.id("day")));
	List<WebElement> alldropdwns=slct1.getOptions();
	
	String elemnttopresent="600";
	boolean iselemtnpresent=true;
	//if we want to change true or false we need to change if else tooooo according to it 
	for (WebElement eachdropdwn : alldropdwns) {
		String txt=eachdropdwn.getText();
		System.out.println(txt);
            if (txt.equalsIgnoreCase(elemnttopresent)) {
            	iselemtnpresent=false;
           }
	
	}
	

               if (iselemtnpresent) {
		           System.out.println(elemnttopresent+" is NOT present");
	                 }             
               else {
		            System.out.println(elemnttopresent +" is  present");
	                 }
    
	
	
	}
		
	}



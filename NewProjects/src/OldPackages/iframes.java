package OldPackages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
	
		driver.switchTo().frame("globalSqa");//for switching inside frame
		WebElement Element_inframe =driver.findElement(By.xpath("//*[@id=\"portfolio_items\"]/div[3]"));
		Element_inframe.click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebElement Element_outframe =driver.findElement(By.xpath("//span[text()='Sortable']"));
		Element_outframe.click();//clicks on element present on outof frame
		
		

	}
	
	
}

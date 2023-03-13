package OldPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class GmailRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		
WebDriver driver;
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/intl/en-GB/gmail/about/");
WebElement Createacount = driver.findElement(By.linkText("Create an account"));
Createacount.click();

driver.findElement(By.name("firstName")).sendKeys("Nihad");

WebElement lastname=driver.findElement(By.id("lastName"));
lastname.sendKeys("Mohiuddin");

WebElement username=driver.findElement(By.id("username"));
username.sendKeys("nihad56482");

WebElement paswrd=driver.findElement(By.name("Passwd"));
paswrd.sendKeys("nihasfhad");

WebElement confrompaswrd=driver.findElement(By.name("ConfirmPasswd"));
confrompaswrd.sendKeys("nihasfhad");


WebElement checkbox= driver.findElement(By.id("i3"));
checkbox.click();
System.out.println(checkbox.isSelected());
Thread.sleep(2000);

WebElement englishunitedkingdom=driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[9]"));
Actions action=new Actions(driver);

//for scrolling down
action.moveToElement(englishunitedkingdom);
action.perform();







		
	}

}

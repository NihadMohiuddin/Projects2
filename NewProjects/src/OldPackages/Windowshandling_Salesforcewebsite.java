package OldPackages;

import java.util.Set;


import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Windowshandling_Salesforcewebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

WebDriver driver;
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.salesforce.com/in/");
Thread.sleep(3000);

WebElement startmyfreeTrial=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a"));
//for scrolling down
Actions action =new Actions(driver);
action.moveToElement(startmyfreeTrial).build().perform();

startmyfreeTrial.click();

Set<String> windowhandles =driver.getWindowHandles();
System.out.println(windowhandles);

java.util.Iterator<String> iterator=windowhandles.iterator();//String parentwindow=iterator.next();
String parentwindow=iterator.next();
String childwindow=iterator.next();
Thread.sleep(5000);
driver.switchTo().window(childwindow);


driver.findElement(By.name("UserFirstName")).sendKeys("nihad");
driver.switchTo().window(parentwindow);



	}

}

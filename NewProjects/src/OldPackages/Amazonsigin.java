package OldPackages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonsigin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\Selnium drivers\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		  driver.get("https://www.google.co.in/");
	      driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486390870450&hvpos=&hvnetw=g&hvrand=429299690705746666&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20453&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMIhZuzmaCC9gIVecFMAh1QdQwKEAAYASAAEgIdZ_D_BwE");
		WebElement signin= driver.findElement(By.id("nav-link-accountList"));
		signin.click();
		WebElement email= driver.findElement(By.id("ap_email"));
		email.sendKeys("mammohiddin@gmail.com");
		email.submit();
		WebElement password= driver.findElement(By.id("ap_password"));
		password.sendKeys("allahu786");
		password.submit();
		
		WebElement searchbar= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		// //*[@type='text']
		searchbar.sendKeys("iphone");
		searchbar.submit();

		Actions action = new Actions(driver);
		Thread.sleep(2000);
   
		//use thread.sleep and build perform buttons
		
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);

		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);

		action.sendKeys(Keys.PAGE_UP).build().perform();
		
          Thread.sleep(2000);

		//for refrsh 
          driver.navigate().refresh();
          
        
         WebElement clickonphn= driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (256 GB) - Green']"));
          clickonphn.click();
         
          //getwindow handles gives how mnay windows are curenlty open in form of set
	Set<String>allwindows=driver.getWindowHandles();
	System.out.println(allwindows.size());	
	
	//here used arrrays for get method
	List<String>arraylist=new ArrayList();
	arraylist.addAll(allwindows);
	
	    Thread.sleep(2000);
	
	  //starts from index number 0 and 0 is parent 1 is childwindow
		driver.switchTo().window(arraylist.get(1));//switch to child
		
		Thread.sleep(2000);
		driver.switchTo().window(arraylist.get(0));//switch to parent window
	
	
	}

}

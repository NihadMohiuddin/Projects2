package OldPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
       driver.findElement(By.partialLinkText("Create New Account")).click();
       Thread.sleep(2000);
       driver.findElement(By.name("firstname")).sendKeys("Nihad");
       driver.findElement(By.name("lastname")).sendKeys("Mohiuddin");
       driver.findElement(By.name("reg_email__")).sendKeys("9603003528");
       driver.findElement(By.id("password_step_input")).sendKeys("nadgfigsdofu");
       WebElement date=driver.findElement(By.id("day"));
       date.click();
      
       Select select=new Select(date);
       boolean tocheckmultipleornot=select.isMultiple();
       System.out.println("dropdown is multiple    "  + tocheckmultipleornot);
     //by index srtarts from '0
      
       Thread.sleep(2000);
       select.selectByIndex(9);
       //by slect value
       Thread.sleep(1000);
       select.selectByValue("6");
       //visible text is the text present in <  >
       Thread.sleep(1000);
       select.selectByVisibleText("20");
       //for month
       WebElement month= driver.findElement(By.id("month"));
    month.click();
    
    Select select1=new Select(month);
    select1.selectByValue("9");
    
    select1.selectByIndex(8);
    //for year

    WebElement year= driver.findElement(By.id("year"));
    Select select2=new Select(year);
    select2.selectByVisibleText("1993");
    
    WebElement elemt= select2.getFirstSelectedOption();
   String d=elemt.getText();
   System.out.println("the year of birth is   "+d);

//radiobutton.
Thread.sleep(2000);

WebElement malegender= driver.findElement(By.xpath("//label[text()=\"Male\"]"));
Thread.sleep(2000);

malegender.click();

    
    


    
    
    
    
}

}

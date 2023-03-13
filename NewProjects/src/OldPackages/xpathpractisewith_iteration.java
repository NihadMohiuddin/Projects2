package OldPackages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



   public class xpathpractisewith_iteration {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    driver.get("https://www.spicejet.com/");
    WebElement radiobuton=driver.findElement(By.xpath("//*[text()='round trip']"));
    radiobuton.click();

   Thread.sleep(2000);

       WebElement from=driver.findElement(By.xpath("//div[text()='From']"));
       from.click();
  

      WebElement selecting_Hyd=driver.findElement(By.xpath("//div[text()='Rajiv Gandhi International Airport']"));
      selecting_Hyd.click();
  
      Thread.sleep(2000);
      //first for finding count of list of elemtns we need to first identify that elemtn first
      WebElement selecting_intrnational=driver.findElement(By.xpath("//div[text()='International']"));
      selecting_intrnational.click();
   
      //use below xpath optionl               
    //div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div 
      List<WebElement> count_ofintrnl_airports=driver.findElements(By.xpath("//div[text()='International']//following::div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs']/div[2]//following::div[@class='css-76zvg2 r-1srvcxg']"));
      System.out.println(count_ofintrnl_airports.size());   

   
      //to get one by one elemtns
    for(int i=0;i<count_ofintrnl_airports.size();i++) {
	WebElement element=count_ofintrnl_airports.get(i);
	System.out.println(element.getText());
    }

      Thread.sleep(2000);
      WebElement selecting_dubai=driver.findElement(By.xpath("//div[text()='Dubai International Airport']"));
      selecting_dubai.click();
          
      Thread.sleep(2000);
      WebElement calender_1=driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-August-2022\"]//following::div[text()='30' and @class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
      calender_1.click();
      Thread.sleep(2000);
      WebElement calender_2=driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-November-2022\"]//div[text()='4']"));
      calender_2.click();//click on calender
      
      Thread.sleep(2000);
      WebElement adultbutton =driver.findElement(By.xpath("//div[text()='1 Adult']"));
      adultbutton.click();//clicks on adult
      
      Actions act=new Actions(driver);
      
    	
      Thread.sleep(2000);
      WebElement passengers_adult=driver.findElement(By.xpath(" //div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
      act.doubleClick(passengers_adult).perform();//clicks on adult + button using actions double click opertation
      
      
      
      Thread.sleep(4000);
  //for printing all dropdown currency elements first need to identify and click before find elements method later use findelemnts
      WebElement dropdowncurrencybutton=driver.findElement(By.xpath("//div[text()='INR']"));
      dropdowncurrencybutton.click();
   
   //for printing all, get all the dropdownselements selected
      List<WebElement> dropdown_currecnylist=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[@data-focusable='true']"));
      System.out.println(dropdown_currecnylist.size());
   
   
   //iterating one by one dropdown webelemnt by using for and printing all dropdowns
      for(int i=0;i<dropdown_currecnylist.size();i++) {
	  WebElement drpdws=dropdown_currecnylist.get(i);
	  System.out.println(drpdws.getText());
	 
   }
		   
   
   
}
}

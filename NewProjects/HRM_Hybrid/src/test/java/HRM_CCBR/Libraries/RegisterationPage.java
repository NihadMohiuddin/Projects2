package HRM_CCBR.Libraries;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

import HRM_CCBR.Utils.Apputils;
import Screenshot.Screenshots;

public class RegisterationPage extends Apputils {

	
	
	
	@FindBy(xpath="//b[normalize-space()='PIM']")
	WebElement  PIM_Elmnt;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement  Addemploye_Elmnt;
	
	@FindBy(id="firstName")
	WebElement fName_Elmnt;
	
	
	@FindBy(id="lastName")
	WebElement  lName_Elmnt;
	
	
	@FindBy(id="employeeId")
	WebElement emplyID_Elmnt;
	
	
	@FindBy(id="btnSave")
	WebElement Savebtn_Elmnt;
	
     @FindBy(linkText ="Employee List")
	WebElement  Emplist_Elmnt;
	
	
	@FindBy(id="empsearch_employee_name_empName")
	WebElement empsearch_Elmnt;
	
	@FindBy(id="searchBtn")
	WebElement searchBtn_Elmnt;
	

	
	@FindBy(xpath ="//tr[@class=\"odd\"]/td[3]/a")
	WebElement Table_Elmnt1;
	
	
	
	@FindBy(xpath ="//*[@id=\"resultTable\"]/tbody/tr/td[4]/a")
	WebElement Table_Elmnt2;
	
	
	String idvalue;             
	
	
	@Test(enabled = false)
	public boolean NewRegistration(String Fname, String Lname) throws InterruptedException, IOException 
	{
		
		Actions act=new Actions(driver);
        act.moveToElement(PIM_Elmnt).perform();
		Addemploye_Elmnt.click();
		
		fName_Elmnt.sendKeys(Fname);
		lName_Elmnt.sendKeys(Lname);
		idvalue=emplyID_Elmnt.getAttribute("value");
		Savebtn_Elmnt.click();
		Thread.sleep(2000);
		Emplist_Elmnt.click();
		
		Thread.sleep(2000);
		empsearch_Elmnt.sendKeys(Fname+" "+Lname);
		
		Screenshots.TakeScreenshot("C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\HRM_Hybrid\\SS\\Registern.png");
		
		Thread.sleep(2000);
		
		searchBtn_Elmnt.click();
	
		  Thread.sleep(3000);
	      String  txt1=  Table_Elmnt1.getText();
		  String  txt2=  Table_Elmnt2.getText();
		
		  System.out.println(txt1+" "+txt2);
		  if (txt1.equalsIgnoreCase(Fname)&&txt2.equalsIgnoreCase(Lname))
		   {
			  return true;
		   } 
		   else
		   {
			   return false;
		   }
		 
	
	
	
	}
	
	
	
	
	
	
	
	
	
	 
	 
	  
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


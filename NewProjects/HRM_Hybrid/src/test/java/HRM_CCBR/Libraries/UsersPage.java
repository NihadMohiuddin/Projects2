package HRM_CCBR.Libraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HRM_CCBR.Utils.Apputils;
import Screenshot.Screenshots;

public class UsersPage extends Apputils {

	//b[normalize-space()='Admin']
	
	
	@FindBy(id ="menu_admin_viewAdminModule")
	WebElement Admin_Elmnt;
	
	
	@FindBy(id ="menu_admin_UserManagement")
	WebElement UsrMngmnt_Elmnt;
	
	
	@FindBy(id ="menu_admin_viewSystemUsers")
	WebElement Users_Elmnt;
	
	@FindBy(id="btnAdd")
	WebElement Addbtn_Elmnt;
	
	
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement empName_Elmnt;
	
	
	
	@FindBy(id = "systemUser_userName")
	WebElement userName_Elmnt;
	
	@FindBy(id = "systemUser_password")
	WebElement Userpass_Elmnt;
	 
	@FindBy(id = "systemUser_confirmPassword")
	WebElement  UserConfrmpass_Elmnt;
	
	
	@FindBy(id = "btnSave")
	WebElement Savebtn_Elmnt;
	
	LoginPage lp=PageFactory.initElements(driver,LoginPage.class);

	
	public boolean AddUser(String Empyname, String Username, String UserPass, String UserconfrPass) throws InterruptedException
	
	{
         Actions act=new Actions(driver);
         act.moveToElement(Admin_Elmnt).moveToElement(UsrMngmnt_Elmnt).moveToElement(Users_Elmnt).click().build().perform();
		
         Addbtn_Elmnt.click();
         empName_Elmnt.sendKeys(Empyname);
         userName_Elmnt.sendKeys(Username);
         Userpass_Elmnt.sendKeys(UserPass);
         UserConfrmpass_Elmnt.sendKeys(UserconfrPass);
         Savebtn_Elmnt.click();
         Thread.sleep(3000);
         lp.logout();
	     lp.Login(Username, UserPass);
	  
	     boolean employemodul_YesorNo=lp.isEmployeeModuleDisplayed();
	
	      return employemodul_YesorNo;
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}

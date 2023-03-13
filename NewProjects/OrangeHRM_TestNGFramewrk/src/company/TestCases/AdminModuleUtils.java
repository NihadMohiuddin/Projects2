package company.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import company.Libraries.LoginPage;
import company.Utils.AppUtils;

public class AdminModuleUtils extends AppUtils {
//always use extends for annotations classes
	String AdminID="Admin";
	String AdminPass="Qedge123!@#";
	LoginPage lp;
	
	
	@BeforeTest
	public void AdminModuleLogin() 
	   {
		     lp=new LoginPage();
		     lp.Loginasadmin(AdminID, AdminPass);
		      boolean res=  lp.isadminModuleDisplayed();
		      assertTrue(res);
		}
	
	
	
	@AfterTest
	public void AdminModuleLogout() 
	{
		lp.Logout();
	}
	
	
	
	
	
	
}

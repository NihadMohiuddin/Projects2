package HRM.Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HRM.Libraries.LoginPage;
import Utils.Apputils;

public class AdminLoginTestWithINValidInputs extends Apputils
{

	
	@Test
	@Parameters({"UserID", "AdminPasswd"})
	public void checkadminlogin(String UserID,String AdminPasswd) 
	
	{
	    LoginPage lp=new LoginPage();
	    lp.Login(UserID,AdminPasswd);
		boolean res=  lp.IserrormsgDisplayed();
		assertTrue(res);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

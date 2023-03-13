package HRM.Testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import HRM.Libraries.LoginPage;
import Utils.Apputils;
import dev.failsafe.internal.util.Assert;


public class AdminLoginTestWithValidInputs extends Apputils
{
  
    @org.testng.annotations.Parameters({"UserID",  "Adminpasswd"})
	@Test
	public void checkadminlogin(String UserID, String Adminpasswd) 
	
	{
		LoginPage lp=new LoginPage();
		lp.Login(UserID, Adminpasswd);
	boolean res=lp.IsAdminmoduleDisplayed();//actual
         assertTrue(res);		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

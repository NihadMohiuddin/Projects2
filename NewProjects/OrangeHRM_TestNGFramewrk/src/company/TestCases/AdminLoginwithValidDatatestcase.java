package company.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import company.Libraries.LoginPage;
import company.Utils.AppUtils;

public class AdminLoginwithValidDatatestcase extends AppUtils {

	
	
	@Test
	@Parameters({"AdminID", "AdminPass"})
	public void checkadminlogin(String AdminID, String AdminPass) 
	{
		LoginPage lp=new LoginPage();
		lp.Loginasadmin(AdminID, AdminPass);
		boolean res=lp.isadminModuleDisplayed();
		assertTrue(res);
		lp.Logout();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

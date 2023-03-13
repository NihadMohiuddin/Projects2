package company.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import company.Libraries.LoginPage;
import company.Utils.AppUtils;

public class AdminLoginwithINValidDatatestcase extends AppUtils {

	
	
	@Test
	@Parameters({"AdminWrnID", "AdminWrnPass"})
	public void adminlogn_invaldata(String AdminWrnID, String AdminWrnPass) 
	{
		LoginPage lp=new LoginPage();
		lp.Loginasadmin(AdminWrnID, AdminWrnPass);
       boolean res= lp.isErrormsgDisplayed();
		assertTrue(res);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

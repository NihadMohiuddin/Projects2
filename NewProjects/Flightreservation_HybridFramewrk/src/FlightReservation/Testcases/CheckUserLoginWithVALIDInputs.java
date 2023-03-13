package FlightReservation.Testcases;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FlightReservation.Libraries.LoginPage;
import FlightUtils.AppUtilis;

public class CheckUserLoginWithVALIDInputs extends AppUtilis {

	
	@Parameters({"EmailID", "Password"})
	@Test
	public void LoginwithValidInputs(String EmailID, String Password) 
	{
		
		
		
		LoginPage lp=new LoginPage();
		lp.Login(EmailID, Password);
	    boolean res=lp.isHomepageDisplayed();
		assertTrue(res);
		lp.Logout();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

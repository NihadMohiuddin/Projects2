package FlightReservation.Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FlightReservation.Libraries.LoginPage;
import FlightUtils.AppUtilis;
import FlightUtils.XlUtils;

public class CheckUserLoginWithINVALIDinputs extends AppUtilis {
	String xlfilepath=System.getProperty("user.dir")+ "\\Excelfolder\\Flightregisteration.xlsx";
			
	String invalidataSheet="invalidata";
	int Totalrows;
	
	
	
	@Test
	public void LoginwithINValidInputs() throws IOException 
	{
		Totalrows=XlUtils.getRowCount(xlfilepath, invalidataSheet);
		System.out.println("total row "+ Totalrows);
		
		LoginPage lp=new LoginPage();
		
		for(int r=1;r<=Totalrows;r++)
		
	{
	  String emailid=XlUtils.getStringCelldata(xlfilepath,invalidataSheet, r, 0);
	  String password=XlUtils.getStringCelldata(xlfilepath,invalidataSheet, r, 1);
		
			lp.Login(emailid, password);
			boolean res= lp.isErrorMsgDisplayed();
			assertTrue(res);
		
			if (res) 
			{
				XlUtils.setCelldata(xlfilepath, invalidataSheet, r, 2, "PASS");
			    XlUtils.setGreencolor(xlfilepath, invalidataSheet, r, 2);
			} 
			
			else
			{
				XlUtils.setCelldata(xlfilepath, invalidataSheet, r, 2, "FAIL");
			    XlUtils.setRedcolor(xlfilepath, invalidataSheet, r, 2);
			}
			
			
	}
		
		
		
      
	
	
	}
	
	
	
	
	
	
	
	
	
}

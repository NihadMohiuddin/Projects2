package company.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import company.Libraries.EmployeePage;
import company.Libraries.LoginPage;

public class EmployeRegisterationTestCase extends AdminModuleUtils {

	
	
	
	
	@Test
	@Parameters({ "Firstname",  "Lasttname"})
	public void employeregistrion(String Firstname, String Lasttname) 
	{
		LoginPage lp=new LoginPage();
		EmployeePage empg=new EmployeePage();
	    boolean res=empg.addemploye(Firstname, Lasttname);
			assertTrue(res);
		
		
		

	}
	
	
	
	
	
	
	
	
	
}

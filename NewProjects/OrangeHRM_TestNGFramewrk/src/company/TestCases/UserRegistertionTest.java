package company.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import company.Libraries.Userpage;

public class UserRegistertionTest extends AdminModuleUtils {

	
	
	@Test
	@Parameters({"Employename",  "usrname",  "passwrd"})
	public void user(String Employename, String usrname, String passwrd) 
	{
		Userpage usrpg=new Userpage();
		usrpg.AddUser(Employename, usrname, passwrd);

	}
	
	
	
	
	
	
	
	
	
	
}

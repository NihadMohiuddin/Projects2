package HRM.Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HRM.Libraries.EmployeePage;
import HRM.Libraries.LoginPage;
import Utils.Apputils;

public class AddEmployeeTestcase extends Apputils{

   @Parameters({"UserID", "Passwrd"})
   @Test(priority = 1)
   public  void CheckaddEmployee(String UserID, String Passwrd)
   {
	   LoginPage lp=new LoginPage();
	   lp.Login(UserID, Passwrd);
       boolean res=  lp.IsAdminmoduleDisplayed();
       assertTrue(res);
    }



    @Parameters({"employename","username", " EmployePasswrd"})
	@Test(priority = 2)
	public void Addingemployeedetails(String employename, String username, String EmployePasswrd ) throws InterruptedException 
	{
		EmployeePage Emplpge=new EmployeePage();
		Emplpge.addemployee(employename, username, EmployePasswrd);


	}

	
}

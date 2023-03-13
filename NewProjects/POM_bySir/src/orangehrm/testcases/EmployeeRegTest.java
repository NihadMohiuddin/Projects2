package orangehrm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import orangehrm.pages.Employee;
import orangehrm.pages.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest extends AppUtils 
{

	
	@Test
	public void checkEmpReg()
	{
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.login("Admin", "Qedge123!@#");
		Employee emp = PageFactory.initElements(driver, Employee.class);
		emp.addEmployee();
		
	}
	
	
	
}

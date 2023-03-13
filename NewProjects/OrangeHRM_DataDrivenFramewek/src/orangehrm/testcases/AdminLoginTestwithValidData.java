package orangehrm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;
import utils.ExcelUtils;

public class AdminLoginTestwithValidData extends AppUtils
{
    String uid;
    String pwd;
    String filepath="C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\Flightreservation\\Excelfolder";
    String validsheetname="validdataHRM";
    @Test
	public void checkAdminLogin() throws IOException
 {
		int rowcount=ExcelUtils.getRowCount(filepath, validsheetname);
		//we can use for loop for colum also
		for(int r=1;r<=rowcount;r++) 
		 {
			uid=ExcelUtils.getStringCellData(filepath, validsheetname,r,0);
			pwd=ExcelUtils.getStringCellData(filepath, validsheetname, r, 1);
			LoginPage lp = new LoginPage();
			lp.login(uid,pwd);
			boolean res = lp.isAdminModuleDisplayed();
			Assert.assertTrue(res);
			lp.logout();
		
		 }
		
  }
	
	
	
	
	
}

package orangehrm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;
import utils.ExcelUtils;

public class AdminLoginTestwithInvalidData extends AppUtils 
{

	String filepath="C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\Flightreservation\\Excelfolder\\OrangeHRM.xlsx";
	String InvaSheetname="invalidataHRM";
	String uidin;
	String pwdin;
	
	@Test
	public void checkAdminLogin() throws IOException
	{
		
		int totalrow=ExcelUtils.getRowCount(filepath, InvaSheetname);
		
		for (int r = 1; r<=totalrow ; r++) 
		{
			uidin=ExcelUtils.getStringCellData(filepath, InvaSheetname, r, 0);
			pwdin=ExcelUtils.getStringCellData(filepath, InvaSheetname, r, 1);
			LoginPage lp = new LoginPage();
			lp.login(uidin,pwdin);
			boolean res =  lp.isErrMsgDisplayed();
			Assert.assertTrue(res);	
		
			
			if (res) 
			{
				ExcelUtils.setCellData(filepath, InvaSheetname, r, 2,"PASS");
				ExcelUtils.setGreenColor(filepath, InvaSheetname,r,2);
			} 
			else 
			{
				ExcelUtils.setCellData(filepath, InvaSheetname, r, 2,"FAIL");
				ExcelUtils.setRedColor(filepath, InvaSheetname, r, 2);
			}
		
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}

package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AppUtils.AppUtils;
import Libraries.LoginPage;

public class DataDrivenTest extends AppUtils {

	
	
	@Test(dataProvider ="Logindata")
	
	
	public void DataDriventest(String Usname, String Pass) throws InterruptedException
   {
	  LoginPage lp=new LoginPage();
	  lp.Login(Usname, Pass);

	}
	
	@DataProvider(name="Logindata")
	public Object[][] DPmethod() 
	  {
		return new Object[][]
		
				{
		{"sfhdghfgh","dgaergfrgregtr"},
		{"24344","bmhjkjy"},
		{"hjlghjk","QWQWS"},
		{"01254254","XCZXV"},
	            };
	 }














}
package com.Guru99demo.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Guru99demo.Pageobjects.LoginPage;
import com.Guru99demo.Testdata.XlUtils;

public class InvalidLoginTest extends BaseClass {

	

	
	public String path="C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\guru99 - Copy - Copy.xlsx";
	public String sheetname="Sheet1";
	public String username;
	public String pass;
	
	@Test
	public void LoginTestinvaliddata() throws IOException 
	{  
		int rowcount=XlUtils.getRowCount(path, sheetname);
		int columcount=XlUtils.getColumCount(path, sheetname, 1);
		
		LoginPage lp=new LoginPage();
		
		boolean res = false;
		
		for (int r = 1; r<rowcount; r++)
		{
			
			username=XlUtils.getStringcellvalue(path, sheetname, r, 0);
			pass=XlUtils.getStringcellvalue(path, sheetname, r, 1);
		
			lp.SetId(username);
			lp.SetPass(pass);
			lp.ClickLoginbtn();
			 res = lp.isErorrAlertDisplayed();
			
			assertTrue(res);
			

			if (res) 
			{
				XlUtils.SetcellData(path, sheetname, r, 2, "PASSED");
				XlUtils.FillGreencolor(path, sheetname, r, 2);
			}
			
			else 
			{
				XlUtils.SetcellData(path, sheetname, r, 2, "FAILED");
				XlUtils.FillRedcolor(path, sheetname,  r, 2);
			}
	
		}
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
}

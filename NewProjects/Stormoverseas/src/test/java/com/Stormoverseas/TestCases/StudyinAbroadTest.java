package com.Stormoverseas.TestCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.testng.annotations.Test;

import com.Stormoverseas.PageObjects.Homepage;
import com.Stormoverseas.PageObjects.StudyAbroadPage;
import com.Stormoverseas.Utils.XlUtils;

public class StudyinAbroadTest  extends BaseClass{

	
	String sheetname="Sheet1";
	String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\Stormoverseas\\TestData\\Stormoverseas.xlsx";
	
	
	
	@Test
	public void studyaboradtest() throws InterruptedException, IOException
	{
		int rowcount=XlUtils.getRowCount(path, sheetname);
		
		homepage       = new Homepage(driver);	
		studyabroadpage = new StudyAbroadPage(driver);
		
		
		for (int r =1; r<=rowcount; r++) 
		{
			String  Cname=XlUtils.getStringcelldata(path, sheetname, r, 0);
			String  Name=XlUtils.getStringcelldata(path, sheetname, r, 1);
			String	mail=Randommail();
		    String	phno=RandomNumer();
		    String	officeName=XlUtils.getStringcelldata(path, sheetname, r,2);
			
		   Thread.sleep(2000);
			homepage.PickCountryStudyAbroad(Cname);
			
			studyabroadpage.setName(Name);
			studyabroadpage.setMail(mail);
			studyabroadpage.setPhno(phno);
			studyabroadpage.PickFieldofStudy("Computer Science & IT");
			
			studyabroadpage.PickOfficeName(officeName);
			
			
			BaseClass.Takescreenshot(Cname);
			studyabroadpage.ClickSubmitbnt();
			
		
		   boolean res=studyabroadpage.ThankyouSuccMsgDispl();
		    if (res)
		    {
		    	XlUtils.setCelldata(path, sheetname, r, 3 ,"PASS");
			    XlUtils.fillGreencolor(path, sheetname, r, 3);
			    assertTrue(res);
			}
		
		    else
		    {
		    	XlUtils.setCelldata(path, sheetname, r, 3 ,"FAILED");
			    XlUtils.fillRedcolor(path, sheetname, r, 3 );
		        assertFalse(res);
			
		    }
		    
		
	
		}	

	}
	
	

	public String Randommail()
	{
		String randommail=RandomStringUtils.randomAlphabetic(5);
		return randommail+"@gmail.com";

	}
	
	public String RandomNumer()
	{
		String randomint=RandomStringUtils.randomNumeric(9);
	    return "9"+randomint; 
	}
	
	
}

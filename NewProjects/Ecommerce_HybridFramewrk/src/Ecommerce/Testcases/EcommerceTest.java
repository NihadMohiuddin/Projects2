package Ecommerce.Testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.Test;

import Ecommerce.Libraries.LoginPage;
import Ecommerce.Libraries.RegisterationPage;
import Ecommerce.Utils.AppUtils;
import Ecommerce.Utils.ExcelUtils;

public class EcommerceTest extends AppUtils {
	
	   String firstname;
	   String lastname;
	   String emailid;
	   String Mobileno;
	   String password;
	   String Confrompassword;
	
	   String invalidFname;
	   String invalidLsname;
	   String invalidEmail;
	   String invalidMobile;
	   String invalidPass;
	   String invalidconfrmpass;
	  
	   Boolean Res;
	   String TCRes;
	   String TSRes;
	   
	   String Invalidmailid;
	   String Invalidpaswrd;

	String filepath="C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\Ecommerce_HybridFramewrk\\Keywords\\EcommerceExcel.xlsx";
	String TCsheet="TestCase";
	String TSsheet="TestSteps";
	
	
	//we put object not inside the case cause it is a loop it will re declare soo...
	RegisterationPage rgp=new RegisterationPage();
	LoginPage lp=new LoginPage();
	
	
	
	//we have only one testcase in Hybrid
	@Test
	public void CheckEcommerceTest() throws IOException {
	
		int totalTc=ExcelUtils.getRowCount(filepath, TCsheet);
		int totalTs=ExcelUtils.getRowCount(filepath, TSsheet);
		
		//r1 means 1st sheet
		for(int r1=1;r1<=totalTc;r1++) 
		{
		
			//captures yes or no
			String yesorno =ExcelUtils.getStringCellData(filepath,TCsheet,r1,2);
			
			if (yesorno.toLowerCase().equals("yes")) 
			{
				
				//capture tcid
				String TCid1 =ExcelUtils.getStringCellData(filepath,TCsheet,r1,0);
				
                 //r2 means 2nd sheet
				for(int r2=1;r2<=totalTs;r2++) 
				 {
			
				
				String TCid2=ExcelUtils.getStringCellData(filepath, TSsheet,r2,0);
					
					if(TCid1.equals(TCid2))
					   {
						
					    String keyword=ExcelUtils.getStringCellData(filepath, TSsheet,r2,5);
						
					    //here cases are the test cases ,,after each each use break
					    
					    
					    //we should give boolean for every case because to get results in excel
					    switch (keyword.toLowerCase()) 
					        {
						
					    
					    //Registeration Testcase
					    case "registeration":
					    	
					    	
					    	firstname=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 6);   
					    	lastname=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 7);   
					    	emailid=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 8);
					    	Mobileno=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 9);  
					    	password=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 10);
					    	Confrompassword=ExcelUtils.getStringCellData(filepath, TSsheet, r2,11);

					    
					    	
					    	//if "account created" msg displayed returns true
					    	Res=rgp.NewRegisteration(firstname,lastname,emailid,Mobileno,password, Confrompassword);
					    	 break;
					    	 
					    	 
					    //Logout Testcase 
					    case "logout":	
					      Res=lp.Logout();
                          break;
					     
					    
					    //login Testcase	
					    case "login":	
					    	//here emailid paswrd value taken from previous registertion case or you can also use excel sheet
					    	
					    	emailid=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 6);
					        password=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 7);
					    	Res=lp.Login(emailid, password);
					    	break;
					    
					    	
					    	
					      //Invalidlogin Testcase
					       //here login cant be so boolean becomes false so assertflase used
					      	//or else u can create new invalidlogin()method ion login page class where we can find error msg while enteringinvalid data
					    case "invalid login":
					    	Invalidmailid=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 6);
					    	Invalidpaswrd=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 7);
					    	
					    	lp.Login(Invalidmailid, Invalidpaswrd);
					    	Res= lp.isErrormsgDisplayed();
					          	break;
					    
					          	
					          	
					          	
					   //testcase for invalid regist 
					    case "invalid registeration":
					    	
					    	 invalidFname= ExcelUtils.getStringCellData(filepath, TSsheet, r2, 6);
					    	 invalidLsname=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 7);
					    	 invalidEmail= ExcelUtils.getStringCellData(filepath, TSsheet, r2, 8);
					    	 invalidMobile=ExcelUtils.getStringCellData(filepath, TSsheet, r2, 9);
					    	 invalidPass=  ExcelUtils.getStringCellData(filepath, TSsheet, r2, 10);
					    	 invalidconfrmpass= ExcelUtils.getStringCellData(filepath, TSsheet, r2, 11);

					    	 rgp.NewRegisteration(invalidFname, invalidLsname, invalidEmail, invalidMobile, invalidPass, invalidconfrmpass);
					    	Res= rgp.IsErrormsgDisplayed();
					    	 break;
					      }
				
					    
					    
					    
					       if (Res) 
					         {
							ExcelUtils.setCellData(filepath, TSsheet, r2, 4, "Pass");
						    ExcelUtils.setGreenColor(filepath, TSsheet, r2, 4);
					         } 
					      else
					         {
					    	  ExcelUtils.setCellData(filepath, TSsheet, r2, 4, "Fail");
							    ExcelUtils.setRedColor(filepath, TSsheet, r2, 4);
						      }
					    
					    // code to fill TCResult 
					      TSRes = ExcelUtils.getStringCellData(filepath, TSsheet, r2, 4);
					      TCRes = ExcelUtils.getStringCellData(filepath, TCsheet, r1, 3);
					       
					       if (!TCRes.equalsIgnoreCase("Fail"))
					       {
						 	
					    	   ExcelUtils.setCellData(filepath, TCsheet, r1, 3, TSRes);
						  
					       }
					       
					     String TcRes= ExcelUtils.getStringCellData(filepath, TCsheet, r1, 3);
					    
					     if (TcRes.equalsIgnoreCase("Pass")) 
					          {
							ExcelUtils.setGreenColor(filepath, TCsheet, r1, 3);
					         	} 
					       else 
					           {
					    	   ExcelUtils.setRedColor(filepath, TCsheet, r1, 3);
						        }
					       
					       
					       
				
			           }
			
				
				
				
			 } 
			
			
		
			}
		
		
		
		
		
		
		
		else
		{
			ExcelUtils.setCellData(filepath, TCsheet, r1, 3,"BLOCKED");
			ExcelUtils.setRedColor(filepath, TCsheet, r1, 3);
		}
		
		
		
		
	}
		
		
		

	
	
	
	
	}	
}

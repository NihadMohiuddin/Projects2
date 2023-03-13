package HRM_CCBR.Testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import HRM_CCBR.Libraries.LoginPage;
import HRM_CCBR.Libraries.RegisterationPage;
import HRM_CCBR.Libraries.UsersPage;
import HRM_CCBR.Utils.Apputils;
import HRM_CCBR.Utils.ExcelUtils;
import Screenshot.Screenshots;

public class HRM_TestCase extends Apputils {

	
	
	String Filepath="C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\HRM_Hybrid\\ExcelFiles\\HRM_hybrid.xlsx";
	String TCSht="TCsheet";
	String TSSht="TSsheet";
	
	
	
	boolean res;
	
	
	
	
	
	//Admin Login
	String Usname;
	String Pass;
	
	
	
	//Employe Login
	String EmpUsr;
	String EmpPas;
	
	
	
	//Adding User
	String EmplName;
	String Usrname ;
	String UsrPass;
	String UsrCnfPass;
	
	String Fname;
	String Lname;
	
	
	
	
	@Test
	
	public void HRMtest() throws IOException, InterruptedException {
		 
		int TotlRowcntTS= ExcelUtils.getRowCount(Filepath,TSSht);
		int TotlRowcntTC= ExcelUtils.getRowCount(Filepath,TCSht);
		
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		RegisterationPage rp=PageFactory.initElements(driver, RegisterationPage.class);
    	UsersPage Up=PageFactory.initElements(driver, UsersPage.class);

		
		
		
		
		
		
		
for (int r1 =1; r1<=TotlRowcntTC; r1++)
{
	
    String rs= ExcelUtils.getStringCellValue(Filepath,TCSht, r1,2);
		
    if (rs.toLowerCase().equals("yes")) 
      {
        String TCid=ExcelUtils.getStringCellValue(Filepath,TCSht, r1,0);
		
        
        //r2 is 2nd sheet row
      
         for (int r2=1;r2<= TotlRowcntTS; r2++) 
         {
			
         String TSid=ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 0);
        
         
             if (TCid.equals(TSid)) 
               {
			
                String keyword= ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 5);
            	 
            	
                
                switch (keyword.toLowerCase())
               
                {
				
                case "login":
					
                	 Usname=ExcelUtils.getStringCellValue(Filepath, TSSht, r2,6);
                	 Pass=  ExcelUtils.getStringCellValue(Filepath, TSSht, r2,7);
                	
                	 lp.Login(Usname,Pass);
                	 Screenshots.TakeScreenshot(".//Screenshot//IsloginSuccfulScrnshot.png");
                	 res= lp.IsLoginSuccefull();
                	 break;

				
                	
                 case "logout":
					res=lp.logout();
                	break;
                
					
                 case "invalid login":
                    
                	 String InvUs= ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 6);
                	 String InvPass= ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 7);
                	
                	 lp.Login(InvUs, InvPass);
                	  Screenshots.TakeScreenshot(".//Screenshot//IserrorMsgDisplayed.png");
                	  res=lp.isErrormsgDisplayed();
                	  String elmtmsg=lp.errormsg();
                	 String c=ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 3);
                	  if(elmtmsg.equals(c))
                	  {
                		  res=true;
                	  }
                	  else
                	  {
                		  res=false;
                	  }
                	  
                	  break;
               
                	  

                 
                 case  "new employee registeration":
                	 
                	 
                	 Fname= ExcelUtils.getStringCellValue(Filepath, TSSht, r2 ,6);
                	 Lname=ExcelUtils.getStringCellValue(Filepath, TSSht, r2 ,7);
                     res= rp.NewRegistration(Fname, Lname);
                	 break;
                
                
                 case "add user" :
                	
                	 EmplName=ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 6);
                	 Usrname =ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 7);
                	 UsrPass=ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 8);
                	 UsrCnfPass=ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 9);
                	 res=Up.AddUser(EmplName, Usrname, UsrPass, UsrCnfPass);
                	 Screenshots.TakeScreenshot(".//Screenshot//IsEmplyModuleDisplayed.png");
                	 break;

                	 
                	 
                
                  case  "employee login":
                    
                	  EmpUsr =ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 6);
                	  EmpPas=  ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 7);
                	  
                	  lp.Login(EmpUsr,EmpPas);
                	  res=lp.isEmployeeModuleDisplayed();
                	  break;
  					
  					  }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
              //update reslt in TS sht
                if (res) 
                  {
					
                	ExcelUtils.setCellData(Filepath, TSSht, r2, 4, "PASS");
                	ExcelUtils.setGreenColor(Filepath, TSSht, r2, 4);
                	
				  }
                
                else 
                  {
                    ExcelUtils.setCellData(Filepath, TSSht, r2, 4, "FAIL");
                	ExcelUtils.setRedColor(Filepath, TSSht, r2, 4);
                	
				  }
                
                
                
                
                //update reslt in TC sht
                 String TSres= ExcelUtils.getStringCellValue(Filepath, TSSht, r2, 4);
                 String TCres=ExcelUtils.getStringCellValue(Filepath, TCSht, r1,3);
               
                 if (!TCres.equals("FAIL"))
                 {
					ExcelUtils.setCellData(Filepath, TCSht, r1,3, TSres);
				 }
                 
                 
                 String TCcolor=ExcelUtils.getStringCellValue(Filepath, TCSht, r1, 3);
                 
                 if (TCcolor.equals("PASS")) 
                 {
                	 ExcelUtils.setGreenColor(Filepath, TCSht, r1, 3);
				 } 
                 else 
				{
                       ExcelUtils.setRedColor(Filepath, TCSht, r1, 3);
				}
                 
                 
                 
                 
		       } 
           
         
         
        
          }
        
        
            
            
            
            
            
            
      } 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         else 
		{
          ExcelUtils.setCellData(Filepath, TCSht, r1, 3, "BLOCKED");
          ExcelUtils.setRedColor(Filepath, TCSht, r1, 3);	 
        }
		    
		    
         
		}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}
		
		
		
		
	
	

	
	
	

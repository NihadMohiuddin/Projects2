package com.Guru99demo.TestCases;

import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Guru99demo.Pageobjects.LoginPage;


public class LoginTest extends BaseClass {

	

	
	 

	@Test
     public  void Login() throws IOException
	{ 
		
	    lp=new LoginPage();
		lp.SetId("mngr465011");
		 logger.info("url opzdvdsened");
		lp.SetPass("manuhUd");
		lp.ClickLoginbtn();
	    assertTrue(lp.isLoginsucc()); 
		lp.Logout();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}

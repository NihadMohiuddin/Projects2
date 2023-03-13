package Json_Project.TestCases;

import static org.testng.Assert.assertFalse;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Json_Project.AppUtils.AppUtils;
import Json_Project.Libraries.Loginpage;

public class LoginTestFuncationality extends AppUtils {

	Loginpage lp=new Loginpage();
	RegisterationTestFunctionality rgt=new RegisterationTestFunctionality();

	@Test(enabled = true)
	public void LoginTestwithInValidInputs() throws IOException, ParseException 
	{
//after registering completed logining with the same registered details so used registertion object
//if i use regist object every iteration same regis details will be added so error comes
		//**without creating registr object here also we can invoke regist methods{by giving priority as 1 for register method and priority 2 for login method}**
	     
         
	      JSONParser jsparser=new JSONParser();
	      
	      FileReader fr=new FileReader(".//Json_Files//JsonProjectfile.json");
	      
	     Object javobj= jsparser.parse(fr);
	     JSONObject jsobj=(JSONObject)javobj;
	    
	     
	     //1st go to array then to object then to string
	     JSONArray array  =(JSONArray)jsobj.get("Invalid Login");
	    //Without using data provider
	     for(int i=0;i<array.size();i++) 
	     {
	    	 
	    	 JSONObject  obj=(JSONObject)array.get(i);
		     String  InvalUsrnme = (String)obj.get("InvalUsrnme");
		     String  InvalPass = (String)obj.get("InvalPass");
		     
		     
		       lp.Login(InvalUsrnme, InvalPass);
	           boolean res= lp.isLoginSuccesful();
	           assertFalse(res);
	    	 
	     }
	    
          
          
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

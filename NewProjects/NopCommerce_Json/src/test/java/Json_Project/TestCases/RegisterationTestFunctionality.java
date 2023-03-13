package Json_Project.TestCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.JsonObject;
import com.mongodb.util.JSON;

import Json_Project.AppUtils.AppUtils;
import Json_Project.Libraries.RegisterationPage;
import io.cucumber.gherkin.internal.com.eclipsesource.json.Json;

public class RegisterationTestFunctionality extends AppUtils {

	
	
	RegisterationPage Rp=new RegisterationPage();
	
	
	@Test(enabled = false)
	public void RegisterationWithValidInputs() throws IOException, ParseException
    {
		
		//"JSON" should be in CAPS
		JSONParser jsparse =new JSONParser();
		
		FileReader fr=new FileReader(".//Json_Files//JsonProjectfile.json");
		
		//converting java obj to json obj
	    Object obj= jsparse.parse(fr);
		      
		JSONObject jsonobj=(JSONObject)obj;
		
		String fname = (String)jsonobj.get("First name");
		String Lname = (String)jsonobj.get("Lastname");
		String mail = (String)jsonobj.get("Email");
		String Cnfrmmail = (String)jsonobj.get("Confirmemail");
		String Username = (String)jsonobj.get("Username");
	    String pass = (String)jsonobj.get("Password");
		String Cnfrmpass = (String)jsonobj.get("Confirm password");

			
		Rp.Newregisteration(fname, Lname, mail,Cnfrmmail, Username, pass,Cnfrmpass);

		
		
		   
         
    
    
    
    
    
    
    
    } 
	
	
	
	
	
	
	
	
}

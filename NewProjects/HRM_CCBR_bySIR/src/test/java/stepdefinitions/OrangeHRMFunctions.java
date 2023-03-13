package stepdefinitions;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeHRMFunctions
{

	public static WebDriver driver;
	String empid;

	@Given("^i open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String arg1) 
	{
		 if(driver.findElement(By.id("btnLogin")).isDisplayed())
		   {
			   System.out.println("Application Launched Successfully.");
		   }
	}
	
	
	
	

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uname) 
	{
	    driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}

	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pword) 
	{
	   driver.findElement(By.id("txtPassword")).sendKeys(pword);
	}

	@When("^i click login$")
	public void i_click_login() 
	{
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^i should see admin module$")
	public void i_should_see_admin_module() 
	{
	    if(driver.findElement(By.linkText("Admin")).isDisplayed())
	    {
	    	System.out.println("System displayed ADmin Module");
	    }
	}

	@When("^i click logout$")
	public void i_click_logout() 
	{
	    driver.findElement(By.partialLinkText("Welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}

	@When("^i close browser$")
	public void i_close_browser() 
	{
	    driver.close();
	}

	
	@Then("^i should see error message$")
	public void i_should_see_error_message() 
	{
		String errmsg;
		errmsg = driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("invalid"))
		{
			System.out.println("System displayed appropriate error message.");
		}
		
	}
	
	@When("^i goto add employee page$")
	public void i_goto_add_employee_page() 
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
	}

	@When("^i enter firstname as \"([^\"]*)\"$")
	public void i_enter_firstname_as(String fname) 
	{
	    driver.findElement(By.id("firstName")).sendKeys(fname);
	}

	@When("^i enter lastname as \"([^\"]*)\"$")
	public void i_enter_lastname_as(String lname) 
	{
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}

	@When("^i click save$")
	public void i_click_save() 
	{
		empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("^i should see registered employee in employee list$")
	public void i_should_see_registered_employee_in_employee_list() 
	{
	    driver.findElement(By.linkText("Employee List")).click();
	    driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	    driver.findElement(By.id("searchBtn")).click();
	    
	    WebElement emptable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = emptable.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				System.out.println("New Employee Registered Successfully");
			}
		}
	    
	}
	
	
}

package orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employee 
{

	@FindBy(linkText = "PIM")
	WebElement pim_link;
	
	
	public void addEmployee()
	{
		pim_link.click();
		
	}
	
	
	
	
}

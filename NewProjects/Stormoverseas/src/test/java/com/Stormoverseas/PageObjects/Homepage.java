package com.Stormoverseas.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Stormoverseas.TestCases.BaseClass;

public class Homepage {

	
	
	Actions act;
	WebDriver driver;
	
	@FindBy(linkText ="Study Abroad")
	WebElement StudyAbroad;
	
	@FindBy(linkText ="Services")
	WebElement Services;
	
	
	@FindBy(linkText ="Blog")
	WebElement Blog;
	
	@FindBy(linkText ="Contact Us")
	WebElement Contact ;
	
	@FindBy(linkText ="Careers")
	WebElement Careers;
	
	
	@FindBy(xpath ="//li[1]/section/ul/li")
	List<WebElement> list ;
	
	/*
	
	*
	*/
	
	
	public Homepage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	

	

	
	
	
	public void PickCountryStudyAbroad(String Countryname) throws InterruptedException
	{	
	    act=new Actions(driver);
		BaseClass.Waithelper(StudyAbroad);
		act.moveToElement(StudyAbroad).build().perform();
		
		
	
		for (WebElement eachcountry : list)
		{
			
			if (eachcountry.getText().equalsIgnoreCase(Countryname)) 
			{
			     BaseClass.Waithelper(eachcountry);
				eachcountry.click();
				break;
			
			} 
			
		}
		
		
		
		
		
		
	}
	
	
	
	public void MoveToServices ()
	{
		
		act=new Actions(driver);
		BaseClass.Waithelper(Services);
		act.moveToElement(Services).click().perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

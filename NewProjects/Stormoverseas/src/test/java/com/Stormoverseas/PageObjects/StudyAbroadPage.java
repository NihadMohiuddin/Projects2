package com.Stormoverseas.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Stormoverseas.TestCases.BaseClass;

public class StudyAbroadPage {

	public WebDriver driver;
	
	@FindBy(id="EName")
	WebElement name;
	
	@FindBy(id="EEmail")
	WebElement Email;
	
	
	@FindBy(how=How.ID ,using="EPhone")
	WebElement phno;
	

	@FindBy(how=How.ID ,using="submitbbtn")
	WebElement submitbbtn;



	@FindBy(how=How.XPATH ,using="//select[@id=\"UpdatedBy\"]")
	WebElement fieldstudyropdwn;

    @FindBy (how=How.ID,using="ELocation")
    WebElement officeropdwn;

    @FindBy(how=How.XPATH,using="//*[text()='Your details has been submitted successfully.One of Our Counselors will be Calling you soon.']")
    WebElement msgthankyou;
    
    
    public StudyAbroadPage(WebDriver driver) {
		
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
	}


              public void setName(String Name) 
               {
            	  
            	   BaseClass.Waithelper(name);
            	   name.clear();
            	   name.sendKeys(Name);
            
               
               }


              public void setMail(String email) 
              {
            	  BaseClass.Waithelper(Email);
           	      Email.clear();
           	      Email.sendKeys(email);
           
              }

              public void setPhno(String Phno) 
              {
            	  BaseClass.Waithelper(phno);
            	  phno.clear();
            	  phno.sendKeys(Phno);
           
              }


              public void PickFieldofStudy(String FieldofStudy) 
              {
           	    try {
            	  Select slct=new Select(fieldstudyropdwn);
              	  slct.selectByValue(FieldofStudy);
           	    }
             catch (Exception e) {
				// TODO: handle exception
			}
              }

              public void ClickSubmitbnt() throws InterruptedException 
              {
            	  Thread.sleep(2000);
           	      BaseClass.Waithelper(submitbbtn);
           	      submitbbtn.click();
              
              }
              
              
              
              public void PickOfficeName(String officename) 
              {
            	//  BaseClass.Waithelper(officeropdwn);
            	  Select slct=new Select(officeropdwn);
              	  slct.selectByVisibleText(officename);
              
              }


        public  boolean ThankyouSuccMsgDispl() 
             {
        	
        	try 
        	{
        	  	msgthankyou.isDisplayed();
        	  	System.out.println("Detailes  Submitted Succefully");
        	  	return true;
			} 
        	
        	catch (Exception e) 
        	{
        		System.out.println("Detailes not submitted");
        		return false;
			}
                
        	
        	
              }

       
}

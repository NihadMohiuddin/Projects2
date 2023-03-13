package com.Stormoverseas.Utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

	
	@Test
	public void m1() throws IOException
	{
		ExtentReports extentreport=new ExtentReports();
		ExtentSparkReporter sparkrepo=new ExtentSparkReporter("C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\Stormoverseas\\extentreport.html"); 
		extentreport.attachReporter(sparkrepo);
		
		ExtentTest test1=extentreport.createTest("test1");
		test1.pass("This is passed");
		extentreport.flush();

		Desktop.getDesktop().browse(new File("C:\\Users\\Ya Rahman\\eclipse-workspace\\NewProjects\\Stormoverseas\\extentreport.html").toURI());
		
		
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}

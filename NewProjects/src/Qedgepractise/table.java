package Qedgepractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	 public  static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       
	      
	       
	        for (int r= 1; r <=3; r++) 
	          {
	        	   driver=new ChromeDriver();
	  	         driver.manage().window().maximize();
	  	         driver.get("https://www.c4dmortgage.com/");
	  	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  	       
	  		
	  	         String path="C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\Asian_pom.xlsx";
	  			FileInputStream fi=new FileInputStream(path);
	  	        XSSFWorkbook wb=new XSSFWorkbook(fi);
	  	        Sheet sht = wb.getSheet("rough");
	  	        int trows=sht.getLastRowNum();
	  	      //  System.out.println("total rows  "+ trows);
	  	         
	  	        int tColum= sht.getRow(1).getLastCellNum();
	  	       // System.out.println("total Colum  "+ tColum);
				
				
			
						
						String finame= sht.getRow(r).getCell(0).getStringCellValue();
				        String Liname= sht.getRow(r).getCell(1).getStringCellValue();
				        String email=  sht.getRow(r).getCell(2).getStringCellValue();
				        String phone=  sht.getRow(r).getCell(3).getStringCellValue();
				    	
				    	
				   
				    	Fillform(finame, Liname, email, phone);
	                      driver.close();
	          }
	        
	      
	        
	        
	       
	         
			
		
		
	       
	        
		
		
	}
	
	
	public  static void Fillform(String finame, String Liname, String email, String phone) 
	 {
		 driver.findElement(By.id("first_name")).sendKeys(finame);
		 
		 driver.findElement(By.id("last_name")).sendKeys(Liname);
		
		 driver.findElement(By.id("email")).sendKeys(email);
		 driver.findElement(By.id("home_phone")).sendKeys(phone);
		
	 }
	
	
	
	
	
	
}

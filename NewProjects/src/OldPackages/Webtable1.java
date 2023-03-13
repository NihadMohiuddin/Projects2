package OldPackages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Webtable1 {
@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"customers\"]//td[2]"));
	System.out.println("Number of rows in table are " + rows.size());//for printing no of rows
	
	
	
	
	List<WebElement> colums=driver.findElements(By.xpath("//table[@id=\"customers\"]//th"));
	System.out.println("Number of colums in table are " + colums.size());//for printing no of colums

	System.out.println("");
	System.out.println("");

	WebElement random=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[7]/td[2]"));
	System.out.println("Name of random value in table is " + random.getText());//for selecting specific value

	System.out.println("");
	System.out.println("");
	
	//for row names
List <WebElement> namesin_rows=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr[1]/th"));
	
	for(WebElement r:namesin_rows) {
	System.out.println("The name of rows in table are "  +  r.getText());	

	}
	
	System.out.println("");//for gaps in console
	System.out.println("");
	
	//for printing columns
	List <WebElement> namesin_colums=driver.findElements(By.xpath("//table[@id=\"customers\"]//td[3]"));
	
		for(int i=0;i<namesin_colums.size();i++) {
			
			WebElement columsname=namesin_colums.get(i);
			System.out.println("the names in columns are "  +   columsname.getText());
			
		}
		
		System.out.println("");
		System.out.println("");

		
			//for printing all in table
			List <WebElement> company =driver.findElements(By.xpath("//table[@id=\"customers\"]//td"));

			for(WebElement data:company) {
				
				//here used syso *without*  'ln' for printing in single line
				
				System.out.print(data.getText()  +  "   "); //  "        " for gaps		
			String text=data.getText();
				if (text.equalsIgnoreCase("Know More")){
					
				System.out.println();
					
					
				}
					
			}
		
			
			System.out.println();
			//index doesnit start with '0'
			//use 2no's 'for' loops for printing all  dynamic data {here used starting 2 index becuse of useles data}
		for(int r=2;r<=rows.size();r++) //r=2,3,4,5,6,7 { row for loop first becasue row is continues is one line it has more  data to print
		{		
			 for	(int c=2;c<colums.size();c++) //for loop prints until columns end and then goes to upperloop r=3{
			//here c<= not used beacuse 'know more' data in table prints in console 
			 {
					
			//'tr' is row num 'td' is column num
			WebElement printall_data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]"));
			System.out.print(printall_data.getText() + "  ");//for spacing sysoln not used for print in horizontal
			
				}			
				
            System.out.println();//out of inner loop and  next step to upperloop
		
		}
		
			
			
			
			
		
		
		
		
		
		
	}
	
	
}
	




	




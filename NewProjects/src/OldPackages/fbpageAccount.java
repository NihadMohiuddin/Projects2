package OldPackages;

	import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class fbpageAccount {
		
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			
			Thread.sleep(6000);

			WebElement createacnt =driver.findElement(By.linkText("Create New Account"));
			createacnt.click();
			
			Thread.sleep(6000);

			
			WebElement firstname =driver.findElement(By.xpath("//input[@type='text'and @name='firstname']"));
			firstname.sendKeys("Nihad");
			
			WebElement surname =driver.findElement(By.name("lastname"));
			surname.sendKeys("Mohammad");
			
			//Thread.sleep(2000);

			WebElement mobilenum =driver.findElement(By.name("reg_email__"));
			mobilenum.sendKeys("9603003528");

			WebElement newpaswrd =driver.findElement(By.id("password_step_input"));
			newpaswrd.sendKeys("fadljhfjhd");
			
			//dropdown
			Thread.sleep(2000);
			
			
			Select slct_date=new Select(driver.findElement(By.xpath("//select[@id='day']")));
			slct_date.selectByValue("20");
			
			
			Select slct_month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
			slct_month.selectByVisibleText("Sep");
			Thread.sleep(2000);

			Select slct_year=new Select(driver.findElement(By.xpath("//*[@id='year']")));
			slct_year.selectByVisibleText("1993");
			
			
		}

	}


	


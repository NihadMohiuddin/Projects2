package PractisingOldPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
              WebDriver driver;
              driver=new FirefoxDriver();

              driver.get("https://en.wikipedia.org/wiki/Allahu_Akbar_(disambiguation)");
	     driver.findElement(By.linkText("Allahu Akbar (anthem)")).click();
	
	}

}

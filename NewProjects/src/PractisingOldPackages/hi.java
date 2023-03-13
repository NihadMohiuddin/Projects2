package PractisingOldPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hi {

	public static void main(String[] args) {
		
          System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

          WebDriver driver;
          
          driver=new ChromeDriver();
          driver.get("https://chromedriver.chromium.org/downloads");
          
          
	}

}

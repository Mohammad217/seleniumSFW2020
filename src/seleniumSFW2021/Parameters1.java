package seleniumSFW2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Parameters1 {
    
	private static final String Browser = null;
	WebDriver driver;
     
     
     @BeforeTest
     @Parameters
     
	public  void main(String[] args) {
    	 if (Browser.equalsIgnoreCase("FireFox")) {
    		System.setProperty("webdriver.gecko.driver","C:\\Users\\alaud\\eclipse-workspace\\Jars\\chromedriver_win32\\geckodriver.exe");
 			driver=new FirefoxDriver();
 				
 		 }
 		 else if (Browser.equalsIgnoreCase("Chrome")) {
 			System.setProperty("webdriver.chrome.driver","C:\\Users\\alaud\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			
		}
		

	}



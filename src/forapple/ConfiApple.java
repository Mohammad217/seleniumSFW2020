package forapple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfiApple{
	WebDriver driver;
	
	public String macLoc="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a";
	public String supportLoc="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a";
	public String tvsLoc="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[6]/a";
	
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alaud\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alaud\\eclipse-workspace\\seleniumSFW2020\\drivers\\geckodriver.exe");
//		System.setProperty("webdriver.msedge.driver", "C:\\Users\\alaud\\eclipse-workspace\\seleniumSFW2020\\drivers\\msedgedriver.exe");
		System.setProperty("webdriver.opera.driver", "C:\\Users\\alaud\\eclipse-workspace\\seleniumSFW2020\\drivers\\operadriver.exe");
		driver= new ChromeDriver();
		driver=new FirefoxDriver();
		driver=new OperaDriver();
//		driver=new EdgeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
		System.out.println("Chrome driver open");
		Thread.sleep(3000);
	}
	@Test
	public void checktooperlink() {
		System.out.println("Apple Header link check");
		driver.findElement(By.xpath(macLoc)).click();
		
		
	}
	@Test
	public void supportlink() {
		System.out.println("Apple Header support link check");
		driver.findElement(By.xpath(supportLoc)).click();
		
	}
	@Test
	public void TVTest() {
		System.out.println("Apple Header TV link check");
		driver.findElement(By.xpath(tvsLoc)).click();
		
	}
	@AfterMethod
	public void closeBrowser(){
		System.out.println (" browser is about to close +++++++");
//	    driver.close();
		System.out.println (" browser is closed +++++++ ");
	}
//	@AfterSuite
//	public void teardown() {
//		System.out.println("Terminated webdriver++++++++++");
//		driver.quit();
//	}
	
}

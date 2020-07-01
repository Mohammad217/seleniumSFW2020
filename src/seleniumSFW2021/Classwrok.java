package seleniumSFW2021;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Classwrok extends WebDriverFunction{ 
   
	
    public	String url ="https://www.facebook.com";
    public	String fnamLoc="//*[@id='u_0_m']";
    public	String fnamVal="Mohammad";
    public	String lnamLoc="//*[@id='u_0_o']";
    public	String lnamVal="Uddin";
	public	String emailLoc="//*[@id=\'u_0_r\']";
	public	String emailVal="arhaansamil0508@gmail.com";
	public	String cemailLoc="//*[@id='u_0_u']";
	public	String cEmail="arhaansamil0508@gmail.com";
	public	String Password="//*[@id=\'u_0_w\']";
	public	String passval="1234567890";
	public	String Month="#month";
	public	String Fmonth="Dec";
	public	String Day="#day";
	public	String Fday="30";
	public	String Year="#year";
	public	String fyear="1980";
	public	String Sex="//*[@id='u_0_7']";
	public	String SingUp="//*[@id=\'u_0_13\']";
	public	String LEmail="//*[@id=\'email\']";
	public  String femail="arhaansamil0508@gmail.com";
	public	String Lpassword="//*[@id=\'pass\']";
	public  String fpaswordval="1234567890";
	public	String Lclick="//*[@id=\'u_0_b\']";

		
	

		 @BeforeTest
		 @Parameters

			public void openBrowers() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\alaud\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();
		        driver.get(url);
		        System.out.println(driver.getCurrentUrl());
		        System.out.println(driver.getTitle());
		        driver.manage().deleteAllCookies();
		        driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 }
		 
		 
		@Test
		public void signUPFBTest() {
			System.out.println("Facebook sign up test");
			driver.findElement(By.xpath(fnamLoc)).sendKeys(fnamVal);
			driver.findElement(By.xpath(lnamLoc)).sendKeys( lnamVal);
			driver.findElement(By.xpath(emailLoc)).sendKeys(emailVal);
		 	driver.findElement(By.xpath(cemailLoc)).sendKeys(cEmail);
		    driver.findElement(By.xpath(Password)).sendKeys(passval);
		    driver.findElement(By.cssSelector(Month)).sendKeys(Fmonth);
		    driver.findElement(By.cssSelector(Day)).sendKeys(Fday);
		    driver.findElement(By.cssSelector(Year)).sendKeys(fyear);;
		    driver.findElement(By.xpath(Sex)).click();
		    driver.findElement(By.xpath(SingUp)).click();
		     }
		
		
		@Test
		public void loginTest() {
			System.out.println("Facebooke login Test");
//			driver.findElement(By.xpath(LEmail)).sendKeys(femail);
//			driver.findElement(By.xpath(Lpassword)).sendKeys(fpaswordval);
//			driver.findElement(By.xpath(Lclick)).click();	
//			
		}
		
//		@AfterTest
//		public void closeBrowser(){
//			System.out.println (" browser is about to close +++++++ ");
//			driver.close();
//			System.out.println (" browser is closeded +++++++ ");
		
		
//		@AfterSuite
//		public void tearDown(){
//
//			driver.quit();
//			System.out.println (" Terminated WD +++++++ ");
//		
		
}
		
		


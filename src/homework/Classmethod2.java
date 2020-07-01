package homework;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Classmethod2 extends Homeworkmethod {


	@Test (priority=6)
	public void loginTest(){
		// selenium code
		System.out.println (" ebay Sign in test");
		driver.findElement(By.xpath(signLoc)).click();
		driver.findElement(By.xpath(clickVeriLoc)).click();
		driver.findElement(By.xpath(emailLoc)).sendKeys(emailVal);
		driver.findElement(By.xpath(ContinueVal)).click();
		driver.findElement(By.xpath(PasswordLoc)).sendKeys(PasswordVal);
		driver.findElement(By.xpath(SignVal)).click();
	}

	@Test (priority=7)
	public void logoutTest(){
		// selenium code
		System.out.println (" ebay Logout test");
	}
	
	@Test(priority = 2)
	public void MotorsTest() {
		System.out.println("ebay Header Motors link check");
		driver.findElement(By.xpath(MotorsLoc)).click();
	}

	@Test (priority=1)
	public void signUpFbTest(){
		System.out.println (" ebay sign up test dosn't work");
		driver.findElement(By.xpath(registerLoc)).click();
		driver.findElement(By.xpath(fnameLoc)).sendKeys(fnameVal);
		driver.findElement(By.xpath(lnameLoc)).sendKeys(lnameVal);
		driver.findElement(By.xpath(emailLoc)).sendKeys(emailVal);
		throw new SkipException ("skipping this test because business requiment is changed. Here is the JIRA Ticket # SF-7");
	}
	@Test(priority = 3)
	public void dealTest() {
		System.out.println("ebay Header Deal Test link check");
		driver.findElement(By.xpath(DealsLoc)).click();
	}
	
	@Test(priority = 4)
	public void toysTest() {
		System.out.println("ebay Header Toys Test link check");
		driver.findElement(By.xpath(ToysLoc)).click();
	}
		
	
	@Test(priority=5, enabled=false)
	public void distableTest(){
		driver.findElement(By.xpath(FashionLoc)).click();
		System.out.println (" Don't want to exectue the test at all and it won't show up in report");
	}

	@Test(priority=8, enabled=true)
	public void tryCatchTest(){
		System.out.println (" try catch block test");
		String actual 		= "Hi! Sign in or register";
		String expected 	= "Hi, Sign in or register";
		try {
			Assert.assertEquals(actual, expected);
		}catch (Throwable issue){
			System.err.println ("actual is not matching with expected" + issue);
		}
		
		
	}
	
}
package expedia;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithValidCredentialUsingEmail extends Config {

	AlljavaCode signIn = new AlljavaCode();
	
	@Test
	public void loginWithValidCredentialUsingEmailTest(){
		System.out.println ("login With Valid Credential Using Email Test start");
		// click on sign in link from header
		clickByXpath (signIn.signInLinkLoc);
		clickByCss(signIn.singInclickVol);
		

		// enter email Require two things, locator and value
		//driver.findElement(By.xpath(signIn.emailLoc)).sendKeys(signIn.emailValue); // OR
		typeByCss (signIn.emailLoc, signIn.emailValue); // re-use the method/function
	
		
		
		typeByXpath (signIn.passwordLoc, signIn.passValue);
		// click Sign In button after enter the password
		clickByXpath (signIn.signInButtonLoc);
		// Assert --- most important 
		
		//String act = driver.findElement(By.xpath(signIn.myActualFirstNameLoc)).getText(); 
		// act is coming from Domain -- the one developer build and release
		//String exp = "Mohammad"; // exp is coming from Requirement or Mock-up
		//Assert.assertEquals(act, exp);
		
		
	}
	
}
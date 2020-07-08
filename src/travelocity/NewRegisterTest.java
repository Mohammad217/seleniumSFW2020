package travelocity;

import org.testng.annotations.Test;

public class NewRegisterTest extends Config{
	
	Register RG = new Register();
	
	@Test
	public void registerWithNewEmailTest(){
		
		clickByXpath(RG.accountButtonLoc);
		clickByXpath(RG.createAccountClickLoc);
		typeByXpath (RG.firstNameInpuutLoc,RG.firstName);
		typeByXpath (RG.lastNameInputLoc,RG.lastname);
		typeByCss   (RG.emailLoc, RG.emailValue); 
		typeByXpath (RG.passwordLoc, RG.passValue);
		clickByXpath (RG.nextButtonLoc	);

	}

}

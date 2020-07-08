package travelocity;

public class SignInSignup {

	// all the locators --- xpath, id, css, name, custom xapth ect
	public String accountButtonLoc="//*[@id=\'header-account-menu\']";
	public String signInLinkLoc 		= "//*[@id=\'account-signin\']"; // xpath
	public String emailLoc 				= "#gss-signin-email"; // css selector
	public String nextButtonLoc			= "//*[@id='root']/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]/button";
	public String passwordLoc			= "//*[@id=\'gss-signin-password\']";
	public String signInButtonLoc		= "//*[@id=\'gss-signin-submit\']";
	public String myActualFullNameLoc	= "//*[@id=\'header-account-menu-signed-in\']";
	public String nameForClickLoc       ="#header-account-menu-signed-in"; //css selector
	public String signOutLoc            ="//*[@id=\'account-signout\']";

	// all the values -- test data, name, email, password
	public String emailValue 			= "alauddinripon@gmail.com";
	public String passValue				= "Samara25";
}

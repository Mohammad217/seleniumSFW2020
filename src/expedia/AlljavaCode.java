package expedia;

public class AlljavaCode extends Config {

	public String signInLinkLoc 		= "//*[@id=\'gc-custom-header-nav-bar-acct-menu\']/button/span"; // xpath
	public String singInclickVol  ="#account-signin > span"; //css selector
	//public String singInclick="//*[@id=\'account-signin\']/span";//xpath
	public String emailLoc 				= "#gss-signin-email"; // css selector
	//public String nextButtonLoc			= "//*[@id='root']/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]/button";
	public String passwordLoc			= "//*[@id=\'gss-signin-password\']";
	public String signInButtonLoc		= "//*[@id=\'gss-signin-submit\']";
	public String myActualFirstNameLoc	= "//*[@id=\'gc-custom-header-nav-bar-acct-menu\']/button/span/span[2]";
	public String clickNameLoc          ="#gc-custom-header-nav-bar-acct-menu > button > span > span.uitk-button-text";//css
    public String signOutLoc            ="//*[@id=\'account-signout\']";
	// all the values -- test data, name, email, password
	public String emailValue 			= "alauddinripon@gmail.com";
	public String passValue				= "Samara25";

}

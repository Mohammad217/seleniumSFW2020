package homework;
import java.sql.SQLException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class Homeworkmethod extends Classmethod {

	public String url 		= "https://www.ebay.com/";
	public String registerLoc ="//*[@id=\'gh-ug-flex\']/a";
	public String  signLoc="//*[@id=\'gh-ug\']/a";
	public String fnameLoc 	= "//input[@name='firstname']";
	public String lnameLoc 	= "//input[@name='lastname']";
	public String fnameVal 	= "Mohammad";
	public String lnameVal 	= "Uddin";
    public String emailLoc="//*[@id=\'userid\']";
    public String emailVal="alauddinripon@gmail.com";
    public String ContinueVal="//*[@id=\'signin-continue-btn\']";
    public String PasswordLoc="//*[@id=\'pass\']";
    public String PasswordVal="Smara25";
    public String clickVeriLoc="//*[@id=\'captcha-box\']/div/div[2]/div[1]/div[3]/span[1]";
    public String SignVal="//*[@id=\'sgnBt\']";
    public String MotorsLoc="//*[@id=\'mainContent\']/div[1]/ul/li[3]/a";
    public String FashionLoc="//*[@id=\'mainContent\']/div[1]/ul/li[4]/a";
    public String DealsLoc="//*[@id=\'mainContent\']/div[1]/ul/li[12]";
    public String ToysLoc="//*[@id=\'mainContent\']/div[1]/ul/li[9]/a";
    
	@BeforeSuite
	public void dbConnect() throws SQLException {
		//dbConnection();
		getCurrentTime();
	}  


	@BeforeClass
	public void beforeClass(){
		System.out.println (" my test class -- happen only once ...........");
	}

	@BeforeMethod // it happens before each single test method
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alaud\\eclipse-workspace\\Jars\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println (" chrome driver open ++++++++++++++++ ");
		
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		System.out.println (" browser is closeded +++++++ ");
		
	}

	@AfterSuite
	public void tearDown(){
		driver.quit();
		System.out.println (" Terminated WD +++++++ ");
		getCurrentTime();
		
	}
	
	
}
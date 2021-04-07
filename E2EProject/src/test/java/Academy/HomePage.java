package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LogingPage;
import PageObjects.ResetPassword;
import resources.Base;


public class HomePage extends Base 

//inside pageobject page we should declare all object of webelement
{
	public WebDriver driver; // create local driver for each class otherwise everytime initilizeDriver() will get override for each test open with new instance which will 
	//create problem for parallel execution test methods. if we want to run in sequence order then one driver for every test is fine
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver=initilizeDriver(); // 
		log.info("Driver is initialized successfully");
		//log.error("eee//");
		
		
	}
@Test(dataProvider="getData")
public void HomePageOpen(String emailId,String password,String text) throws IOException {
	
	driver.get(URL);
	//log.info("Navigated to Home Page");
	LandingPage lp=new LandingPage(driver);
	LogingPage l=lp.getlogin();
	
	l.getemailIdEnter().sendKeys(emailId);;
	l.getpasswordEnter().sendKeys(password);;
	l.getClickOnlogin().click();
	log.info("Login button clicked successfully");
	ResetPassword rp=l.getForgotPassword(); // performing clicking in ForgotPassword by calling this method
	rp.getResetEmailId().sendKeys("XXXP@gmail.com");
	rp.getSendMeInstruction().click();
	
}
// same test case is running for multiple time(ex-2 times) for multiple data set(ex-2 times).
@DataProvider
public Object[][] getData()
{
	// test data are column and data set are rows
	Object[][] data=new Object[2][3];
	
	data[0][0]="aabb@gmail.com";
	data[0][1]="123467";
	data[0][2]="Restricted User";
	
	data[1][0]="xyz@gmail.com";
	data[1][1]="9999";
	data[1][2]="Non Restricted User";

	return data;		
}

@AfterTest
public void tearDown()
{
	driver.close();
	log.info("Driver closed successfully");
}
}

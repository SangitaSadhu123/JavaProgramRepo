package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LogingPage;
import resources.Base;

public class ValidateTitle extends Base 
{
	public static Logger log=LogManager.getLogger(ValidateTitle.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		initilizeDriver();
		//log.info("Driver is initialized successfully");
		driver.get(URL);
		//log.info("Navigated to Home Page");
	}
	
	@Test
	public void titleValidation() throws IOException {
			
			
			LandingPage lp=new LandingPage(driver);
			Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES");
			//log.info("Title Validation done");
}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		//log.info("Driver closed successfully");
	}
}

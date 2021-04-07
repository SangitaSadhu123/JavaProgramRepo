package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LogingPage;
import resources.Base;

public class LandingPageValidation extends Base 
{
	public WebDriver driver;
	public LandingPage lp;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver=initilizeDriver();
		//log.info("Driver is initialized successfully");
		driver.get(URL);
		//log.info("Navigated to Home Page");
	}
	@Test
	public void NavBarValidation() throws IOException {
			
			
			lp=new LandingPage(driver);
			Assert.assertTrue(lp.getNavBar().isDisplayed());
			log.info("Navigation Bar clicked successfully");
			
	}
	
	@Test
	public void titleValidation() throws IOException {
			
			
		
			Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES111");
			log.info("Title Validation done");
}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		//log.info("Driver closed successfully");
	}
}

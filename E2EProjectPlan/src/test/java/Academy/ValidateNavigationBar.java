package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base{
	public static Logger log=LogManager.getLogger(ValidateNavigationBar.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		
		initilizeDriver();
		//log.info(message);
		driver.get(URL);
		//log.info("Driver is initialized successfully");
	}
@Test
public void NavBarValidation() throws IOException {
		
		
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		
		
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}

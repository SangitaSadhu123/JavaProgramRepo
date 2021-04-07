package PracticeProject.AllFunctions;

import java.io.IOException;import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.PracticePage;
import resources.Base;

public class PracticePageValidation extends Base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver=initilizeDriver(); // 
		//log.info("Driver is initialized successfully");
		//log.error("eee//");
	}
	
	@Test
	public void radiobutton()
	{
		PracticePage pp=new PracticePage(driver);
		int count=pp.getRadiobutton().size();
		System.out.println(count);
		for(WebElement radiobutton:pp.getRadiobutton())
		{
			
			
		}
		
	}
	public void tearDown()
	{
		driver.close();
		//log.info("Driver closed successfully");
	}

}

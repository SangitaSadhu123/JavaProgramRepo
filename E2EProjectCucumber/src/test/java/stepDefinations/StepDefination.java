package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.Base;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.LogingPage;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features", 
		glue="stepDefinations") 

public class StepDefination extends Base {
	public LogingPage l;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver=initilizeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	/*@Given("^Click on Login link in home page to land on Secure sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_page() throws Throwable {
		LandingPage lp=new LandingPage(driver);
		if(lp.getPopUpSize()>0) // checking if there are more than 1 element means size is greater than 0 then clcik on that popup
		{
			lp.getPopUp().click();
		}
		 l=lp.getlogin();
	}*/
	
	  @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		  l.getemailIdEnter().sendKeys(username);;
			l.getpasswordEnter().sendKeys(password);;
			l.getClickOnlogin().click();
	    }


	@Then("^Verify that user is not able to logged in$")
    public void verify_that_user_is_not_able_to_logged_in() throws Throwable {
       //Assert.assertTrue(l.getInvalidMsg().isDisplayed());
		System.out.println(l.getInvalidMsg().getText());
		
    }
	 @And("^Close the browser$")
	    public void close_the_browser() throws Throwable {
	       driver.quit();
	    }


}
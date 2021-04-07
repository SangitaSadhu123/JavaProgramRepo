package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features", 
		glue="stepDefinations")      

//location of Features file
//Package name of stepDefination

public class StepDefination {

	@Given("^User is on NetBanking login page$")
	public void user_is_on_NetBanking_login_page() throws Throwable {
		System.out.println("login");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
	    System.out.println(arg1);
	    System.out.println(arg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("home");
	}

	@Then("^Cards dispalyed are \"([^\"]*)\"$")
	public void cards_dispalyed_are(String arg1) throws Throwable {
		System.out.println(arg1);
	}

}
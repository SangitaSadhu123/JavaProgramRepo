package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) // means running testcases using junit
@CucumberOptions(
		
		features= "src/test/java/features",
		glue= "stepDefinations")



public class TestRunner extends AbstractTestNGCucumberTests{

}

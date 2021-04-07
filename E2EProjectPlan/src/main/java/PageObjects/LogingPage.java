package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogingPage {


	public WebDriver driver;
	By emailId=By.cssSelector("input[id='user_email']");
	By password=By.cssSelector("input[id='user_password']");
	By login=By.cssSelector("input[value='Log In']");
	
	public LogingPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	
	public WebElement getemailIdEnter()
	{
		
		return driver.findElement(emailId);
	}
	
	public WebElement getpasswordEnter()
	{
		
		return driver.findElement(password);
	}
	public WebElement getClickOnlogin()
	{
		
		return driver.findElement(login);
	}
}

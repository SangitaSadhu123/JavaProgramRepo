package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogingPage {


	public WebDriver driver;
	private By emailId=By.cssSelector("input[id='user_email']");
	private By password=By.cssSelector("input[id='user_password']");
	private By login=By.cssSelector("input[value='Log In']");
	private By forgotpassword=By.cssSelector("a[href*='password/new']");
	private By invalidMsg=By.xpath("//div[contains(text(),'Invalid email or password.')]");
	
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
	public WebElement getInvalidMsg()
	{
		
		return driver.findElement(invalidMsg);
	}
	
	
	public ResetPassword getForgotPassword()
	{
	 driver.findElement(forgotpassword).click();
	 return new ResetPassword(driver);
	  
	}
}

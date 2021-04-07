package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPassword {
	public WebDriver driver;
	
	private By emailID=By.xpath("//label[contains(text(),'Email Address')]/parent::div//div/child::*");
	
	private By sendMeInstruction=By.xpath("//input[@value='Send Me Instruction']");
	public ResetPassword(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getResetEmailId()
	{
		
		return driver.findElement(emailID);
	}
	
	public WebElement getSendMeInstruction()
	{
		
		return driver.findElement(sendMeInstruction);
	}
	
}

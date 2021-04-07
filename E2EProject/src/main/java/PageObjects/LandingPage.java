package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// pageobject page we should declare all object of webelement
public class LandingPage{

	public WebDriver driver;
	private By signin=By.xpath("//i[@class='fa fa-lock fa-lg']//parent::a"); 
	private By title=By.xpath("//div[@class='text-center']//h2");
	private By navBar=By.xpath("//nav[@class='navbar-collapse collapse']");
	
	// 	In order to pass the info of driver object into pageObject classes,  We will create parameterized constructor in the pageObject class and
	//we will create object of this pageObject class in test case with parameter as webdriver object.
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//returning all the locators of webElement
	
	public LogingPage getlogin()
	{
		
	 driver.findElement(signin).click();
	 LogingPage l=new LogingPage(driver);
	 return l;
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavBar()
	{
		return driver.findElement(navBar);
	}


}




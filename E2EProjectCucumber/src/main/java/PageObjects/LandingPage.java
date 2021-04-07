package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// pageobject page we should declare all object of webelement
public class LandingPage{

	public WebDriver driver;
	private By signin=By.xpath("//i[@class='fa fa-lock fa-lg']//parent::a"); 
	private By title=By.xpath("//div[@class='text-center']//h2");
	private By navBar=By.xpath("//nav[@class='navbar-collapse collapse']");
	private By popUp=By.xpath("//button[contains(text(),'NO THANKS')]");
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
	public WebElement getPopUp()
	{
		return driver.findElement(popUp);
	}
	public int getPopUpSize()
	{
		return driver.findElements(popUp).size();
	}


}




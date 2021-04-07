package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage{

	public WebDriver driver;
	By signin=By.xpath("//i[@class='fa fa-lock fa-lg']//parent::a");
	By title=By.xpath("//div[@class='text-center']//h2");
	By navBar=By.xpath("//nav[@class='navbar-collapse collapse']");
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	
	public WebElement getlogin()
	{
		
		return driver.findElement(signin);
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




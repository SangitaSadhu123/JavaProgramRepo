package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	
	
	private By title= By.xpath("//h1[contains(text(),'Practice Page')]");
	private By radiobutton=By.xpath("//input[@name='radioButton']");
	private By checkbox=By.xpath("//label//input[@type='checkbox']");
	private By dropdown=By.xpath("//select[@id='dropdown-class-example']//option");
	private By autosuggested= By.xpath("//input[@id='autocomplete']");
	
	public WebDriver driver;
	public PracticePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	public List<WebElement> getRadiobutton()
	{
		List<WebElement> radiobuttons=driver.findElements(radiobutton);
		return radiobuttons;
	}
	
	public List<WebElement> getCheckbox()
	{
		return driver.findElements(checkbox);
	}
	public List<WebElement> getDropdown()
	{
		return driver.findElements(dropdown);
	}
	
	public WebElement getAutosuggested()
	{
		return driver.findElement(autosuggested);
	}
	
	
	
	
	
}

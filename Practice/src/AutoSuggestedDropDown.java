import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown {
	static WebDriver driver;
	public static void main(String[] args) {
		AutoSuggestedDropDown.browserOpen();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input---");
		String input=sc.nextLine();
		//AutoSuggestedDropDown.autoSuggestedDrop();
		
		AutoSuggestedDropDown.autoSuggestedDrop(input);
		
	}

	public static void browserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 //driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
	
	public static void autoSuggestedDrop(String input)
	//public static void autoSuggestedDrop()
	{
		 driver.findElement(By.id("autosuggest")).sendKeys("Chi");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 
		 for(WebElement option:options)
		 {
			 if(option.getText().equalsIgnoreCase(input))
			 {
				 option.click();
				 System.out.println("aa");
				 break;
			 }
			/* else
			 {
				 System.out.println("input mismatch");
			 }*/
				 
			 
		 }
	}

	
}

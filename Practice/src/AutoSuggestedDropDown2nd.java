import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// Enter the letters BENG
//verify if "BANGALORE AIRPORT" option is displayed in suggestive box or not
public class AutoSuggestedDropDown2nd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver (2).exe");
		
		 WebDriver driver=new ChromeDriver();
		 //driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.get("https://ksrtc.in/oprs-web/");
		 driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[@name='fromPlaceName']")).click();
		 driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[@name='fromPlaceName']")).sendKeys("BAN");
		 
		 driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[@name='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		 
		// System.out.println(driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[@name='fromPlaceName']")).getText()); // not able to get the value or text present in text box bcz its hidden text
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver; //To find hidden element
		 
		 //1. to find element using jS document.getElementById("fromPlaceName")
		 //2. document.getElementById("fromPlaceName").value to get value present in Text
		 //3. to copy same in Eclipse have to write below way
		 //4. where ever we have " " inside double codes(" ") then we have to use \
		 //5. return is use to  retrive the value in jS
		 
		String script="return document.getElementById(\"fromPlaceName\").value;"; //storing the value
		
		String text=(String)js.executeScript(script);  // this method will execute the script
		
		System.out.println(text); // !BAN
		
		//1st it will check (!BAN =="BANGALORE AIRPORT")
		while(!text.equalsIgnoreCase("BANGALORE AIRPORT")) // loop will keep on execute untill BANGALORE AIRPORT will found
		{
			driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[@name='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN); // do one by one key down to validate the text
			text=(String)js.executeScript(script);  // this method will execute the script to get the text and this text will keep on change with one by one key down
			System.out.println(text);
		}
		 
	}

	}



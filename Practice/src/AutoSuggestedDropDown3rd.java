import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown3rd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 //driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).click();
		 driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).sendKeys("Ind");
		 driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).sendKeys(Keys.ARROW_DOWN);
		 //driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).getText();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		String script= "return document.getElementById(\"autocomplete\").value;";
		String text=(String)js.executeScript(script);
		
		//check 10 times if the given option is not present in the list like negative text case 
		int i=0;
		//while(!text.contains("British Indian Ocean Territory"))
		while(!text.equalsIgnoreCase("British Indian Ocean Territory"))
		{
			i++; // i will loop 9 times and will do key down for 9 times if element is present it will pass otherwise fail
			driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).sendKeys(Keys.ARROW_DOWN);
			text=(String)js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
			break;
			}
		
	}
		if(i>10)
			System.out.println("element found");
		else
			System.out.println("element not found");
		 
	}
	

}

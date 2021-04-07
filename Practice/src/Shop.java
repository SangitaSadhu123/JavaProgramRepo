import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("a[href*='shop']")).click();
		List<WebElement> items=driver.findElements(By.xpath("//app-card//div[@class='card h-100']"));
		for(WebElement item:items)
		{
			String itemName=item.findElement(By.xpath("div//h4")).getText();
			if (itemName.equalsIgnoreCase("iphone X"))
			{
				item.findElement(By.xpath("div//button")).click();
				
			}
			
		}

	}

}

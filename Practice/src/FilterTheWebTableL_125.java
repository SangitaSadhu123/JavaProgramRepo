import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTheWebTableL_125 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Rice");
			// Now we want to get all the web element list row result which is having rice.
			
			List<WebElement> veggies=driver.findElements(By.xpath("//tr//td[1]")); 
			
			List<WebElement> foundSearchedResult=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
			Assert.assertEquals(veggies.size(), foundSearchedResult.size());
			

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<String> list= new ArrayList<String>();
		List<String> list1=new ArrayList<String>();
		
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys("ber");
		driver.findElement(By.xpath("//form[@class='search-form']//button[@class='search-button']")).click();
		List<WebElement> buttons=driver.findElements(By.xpath("//div[@class='product']//button"));
		for(WebElement button:buttons)
		{
			list.add(button.findElement(By.xpath("parent::div/parent::div//h4")).getText());
			button.click();
			
		}
		System.out.println(list);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@class='product-name']")));
		
		List<WebElement> listOfitems=driver.findElements(By.xpath("//p[@class='product-name']"));
		System.out.println(listOfitems.size());
		for(WebElement listOfitem:listOfitems)
		{
			list1.add(listOfitem.getText());
			
		}
			System.out.println(list1);
			Assert.assertEquals(list, list1);
		
		
		
	}

}

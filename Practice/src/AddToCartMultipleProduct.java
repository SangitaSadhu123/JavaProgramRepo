import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMultipleProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Beans" }; // Add all the products which needs to be
																				// added

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name")); // getting all the products
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		for (int i = 0; i < products.size(); i++) // iterating all the products
		{
			// products.get(i).getText() ->Brocolli - 1 Kg , but passing products in array as "Brocolli" so have to split
			// "Brocolli - 1 Kg" string but still there is space after splitting so have to trim the space

			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim(); // OutPut: Brocolli

			List<String> itemsNeededList = Arrays.asList(itemsNeeded); // converting Array to ArrayList ts are moving to
																		// Array List
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// we have 3 items in Array but for 3 items loop is running 30 times so if we check 
			//whether the product(formatedName) is available in theArrayList(itemsNeededList) or not
			// increament j one by one for 3 products loop will run 3 times.
			if (itemsNeededList.contains(formatedName)) 
														
			{

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click(); // click add to
																										// cart
				if (j == itemsNeeded.length) // when j will be 3 times (length of Array 3) then if loop will break when
												// j =1 it will not enter to if block
					break;

			}

		}

	}

}

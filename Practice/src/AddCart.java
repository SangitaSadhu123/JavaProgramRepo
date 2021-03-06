import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getText().contains(input)) // when adding one product to "Add to Cart", can pass single
															// input and compare with product of i^th position.

			{
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				break;

			}

		}

	}

}

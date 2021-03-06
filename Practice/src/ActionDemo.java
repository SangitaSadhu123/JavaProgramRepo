

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act=new Actions(driver);
		// mouse hover
		act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform(); // build() means ready to execute.it is used for muktiple action
		// perform() means ii will execute.
		
		//act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform(); // Right click 
		WebElement element=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		act.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform(); 
	}

}

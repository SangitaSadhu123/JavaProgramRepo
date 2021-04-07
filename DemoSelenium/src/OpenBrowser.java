import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\DemoSelenium\\chromedriver_win32_v2.42.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=selenium.org+download&oq=selenium&aqs=chrome.0.69i59j69i57j0i433l2j69i65l2j69i60l2.7438j0j7&sourceid=chrome&ie=UTF-8");






	}

}

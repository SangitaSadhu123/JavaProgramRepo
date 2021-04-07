import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxUsingJavaStream {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
		checkboxes.stream().filter(s->s.getText().equalsIgnoreCase("Senior Citizen")).forEach(s->s.click());
				//price.forEach(s->System.out.println(s));
				//price.get(0).click();
		//List<WebElement> price=
	}

}

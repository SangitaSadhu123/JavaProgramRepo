import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size()); // how many frame are there in webpage
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); //swithching to webpage to frame
		
		// Drag and Drop
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		

	}

}

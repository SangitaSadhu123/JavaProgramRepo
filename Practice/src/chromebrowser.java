import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chromebrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://google.com");

		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("https://sitiam04.dcas.dc.gov:4446/Curam/");
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).getText());
		
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		
		
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id='details']//child::p//a[contains(text(),'Proceed to sitiam04.dcas.dc.gov')]"))));*/
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='details']//child::p//a[contains(text(),'Proceed to sitiam04.dcas.dc.gov')]")).getText());
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='details']//child::p//a[contains(text(),'Proceed to sitiam04.dcas.dc.gov')]")).click();
		System.out.println("moving to next page");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    
		//driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Username')]//following-sibling::input")).sendKeys("nidhi.dhawan");
		driver.findElement(By.xpath("//label[contains(text(),'Password')]//following-sibling::input")).sendKeys("Test@321!");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//driver.close();
		

	}

}

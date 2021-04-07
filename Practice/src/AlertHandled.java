import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 //driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 //Accept Alert or okay
		 driver.findElement(By.xpath("//input[@value='Alert']")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.switchTo().alert().accept();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 // dismiss or No or cancel
		 
		 driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 
		 driver.switchTo().alert().dismiss();;
		 

	}

}

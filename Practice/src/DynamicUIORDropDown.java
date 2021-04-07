import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicUIORDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 //driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("//input[@value='RoundTrip']")).click(); //Radio button round trip
		 
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //-> click on the destination xpath 
		 
		 
		 driver.findElement(By.xpath("//a[@value='BLR']")).click(); // get the selected xpath for dropDown value
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // dynamic index dropDown selectio
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); //parent to child relationship xpath
		 
		 driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		 
		//if isEnabled and isDisabled method will not work then we have to approch this process
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		 {
			 System.out.println("is disabled");
			 Assert.assertTrue(true);
			 
		}
		 else
		     Assert.assertTrue(false);
		 
		 
		  //Dropdown PASSENGERS
		 driver.findElement(By.xpath("//label[contains(text(),'PASSENGERS')][1]/following-sibling::div[contains(text(),'1 Adult')]")).click();
		
		 WebElement element=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		 Select s=new Select(element);
		 s.selectByIndex(3);
		 
		 driver.findElement(By.xpath("//input[@value='Search'][1]")).click(); //serach button
		
		 
	}

}

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortTableList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elements=driver.findElements(By.xpath("//tr//td[1]"));
		
	   /* List<String> ls=new ArrayList<String>();
	
	  
	    List<String> ls1=new ArrayList<String>();
		for(WebElement element:elements)
		{
			ls.add(element.getText());
			ls1.add(element.getText());
		}*/
		   List<String> ls=new ArrayList<String>();
		
		  
	    
		for(WebElement element:elements)
			ls.add(element.getText());
			
		Collections.sort(ls);
		System.out.println(ls);
		//Assert.assertTrue(ls1.equals(ls), "fail");
		
		
		
		
	}

}

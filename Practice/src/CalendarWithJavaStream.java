import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarWithJavaStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September"))
			
		{
			driver.findElement(By.xpath("[class='datepicker-days'] th[class='next']")).click(); 
			
		}//while loop will keep on executing until it becomes false. always while(true)-> to make it false have to use !
		
		
		// 1. Grab common attribute // put into list and iterate one by one then get the text of the i th position and check if it is same with user given date or not
		List<WebElement> dates=driver.findElements(By.className("day"));
		dates.stream().filter(s->s.getText().contains("23")).forEach(s->s.click());
	/*	for(int i=0;i<driver.findElements(By.className("day")).size();i++)
		{
			if(driver.findElements(By.className("day")).get(i).getText().equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click(); //2.  if same then click on the i th position webElement
				break;
			}
			
		}*/
	}

}

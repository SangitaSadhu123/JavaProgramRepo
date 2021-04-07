import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOneInNewTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver_win32_v2.42.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		//1. get the number of link present in UI
		System.out.println(driver.findElements(By.tagName("a")).size()); 
		
		//2. get the number of link present in footer of UI
		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); //limitting of driver
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. get the number of link present in one colum of footer
		WebElement column=footerdriver.findElement(By.xpath("//div[@id='gf-BIG']//tr//td[1]//ul"));
		List<WebElement> columnLinks=column.findElements(By.tagName("a"));
		System.out.println(columnLinks.size());
		
		
		//4. click on each of the link
		for(int i=0;i<columnLinks.size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);  // It will help to open all the link 
			columnLinks.get(i).sendKeys(clickonlinkTab);//open the link using sendkeys
			
		}// opens all the tabs
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> itr=set.iterator();
		// hasNext will check if at 0 index is having any window or not
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		

	}

}

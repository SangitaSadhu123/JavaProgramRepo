import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListUsingValue {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver_win32_v2.42.exe");
		
		WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 
		 Select s=new Select(element); 
	
		
		 
		 
			List<WebElement> dropDwonLists= s.getOptions(); // number of dropdown options
			
			int dropdownNumber=dropDwonLists.size();
			System.out.println(dropdownNumber);  // including select option from dropdown
			//s.selectByIndex(1); 
			s.selectByIndex(dropdownNumber-1);  //-> To get select the last option from dropdown list
			//s.selectByIndex(dropdownNumber-2);  -> To get select the second last option from dropdown list
			 
			/*for(int i=0;i<dropDwonLists.size();i++)
			{
				System.out.println("dropdownName"+dropDwonLists.get(i).getText());
				if(dropDwonLists.get(i).getText().equalsIgnoreCase("GBP"))
				{
					
					dropDwonLists.get(i).click();
				}
				
			}*/
			//s.selectByValue("INR");
			
	}

}

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownList {
	
	// Dropdown Handle for CURRENCY using index 
	static WebDriver driver;
	//static String destination="ctl00_mainContent_ddl_originStation1";
	static String currency="ctl00_mainContent_DropDownListCurrency";
	
	public static void browserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver_win32_v2.42.exe");
		
		 driver=new ChromeDriver();
		 //driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void dropDownSlectByIndex(int indexValueFromUser, WebElement element)
	{
		
		Select s=new Select(element);
		List<WebElement> dropDwonLists=s.getOptions(); // number of dropdown options
		System.out.println(dropDwonLists.size());
		/*for(WebElement dropDwonList:dropDwonLists)
		{
			System.out.println("rrr--"+dropDwonList.getText());
			
			
		}*/
		
		for(int i=0;i<dropDwonLists.size();i++)
		{
			System.out.println("rrr--"+dropDwonLists.get(i).getText());
			
			
		}
		s.selectByIndex(indexValueFromUser);
	}

public static void main(String[] args) {
	DropDownList.browserOpen();
	WebElement element=driver.findElement(By.id(currency));
	Scanner sc=new Scanner(System.in);
	int indexValueFromUser=sc.nextInt();
	DropDownList.dropDownSlectByIndex(indexValueFromUser,element);

	
	}

}

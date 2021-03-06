import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class CheckBox {

	static WebDriver driver;

	public static void browserOpen() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver_win32_v2.42.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}

	public static void checkbox(String input) {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
		
		//System.out.println(checkboxes.size());
		
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).getText().equalsIgnoreCase("Sr. Citizen"))
			{
				
				if(checkboxes.get(i).isEnabled())
				{
					if(checkboxes.get(i).isSelected())
					{
				/*Actions act=new Actions(driver);
				act.clickAndHold(checkboxes.get(i)).perform(); // tool tip operation
				
				//WebElement cropTracker = null;
				//act.dragAndDropBy(cropTracker, 30,220).perform();
				//act.clickAndHold(cropTracker).
				String color=checkboxes.get(i).getCssValue("color");
				System.out.println(color);
				String hex = Color.fromString(color).asHex();
				System.out.println(hex);
				
				String backgroundColor=checkboxes.get(i).getCssValue("background-color");
				System.out.println(color);
				String hex1 = Color.fromString(backgroundColor).asHex();
				System.out.println(hex1);*/
				
				
				checkboxes.get(i).click();
				break;
				}
				}
				
			}
			
		}
		/*for (WebElement checkbox : checkboxes) 
			{

			if (checkbox.getText().equalsIgnoreCase(input)) {

				if (checkbox.isSelected()) // boolean value

					System.out.println(checkbox.getText());
				else

					checkbox.click();
			}
		} */
	}

	public static void main(String[] args) {

		CheckBox.browserOpen();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input---");
		String input = sc.nextLine();
		CheckBox.checkbox(input);
	}

}

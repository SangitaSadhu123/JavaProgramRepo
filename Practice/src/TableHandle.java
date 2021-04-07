import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableHandle {

	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30259/engw-vs-wiw-2nd-t20i-west-indies-women-tour-of-england-2020");
		// get total run of all the players
		//if we inspect on table and it will give all the table's the xpath or CSS
		// so we have to get 1st the xpath or css for parent table from where want to get total run of all the players (means get the sub section)
		//WebElement table=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]"));=xpath
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); //css of parent table
		
		// It will give how many rows present in the parent table which is common CSS
		System.out.println("Rows present in parent table: " +table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size());

		//inside row have to grab 3rd child or 3rd column using css . 1st get css for row then move to 3rd column
		List<WebElement> element=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		for(int i=0;i<element.size()-2;i++)
		{
			String value=element.get(i).getText();
			int valueInteger=Integer.parseInt(value); // converting value from String to integer
			sum=sum+valueInteger ; // sum of all players run
		}
		//System.out.println(sum);
		String Extras=table.findElement(By.xpath("//div[@id='innings_1']//div[contains(text(),'Extras')]/following-sibling::div[1]")).getText();
		int ExtrasValues=Integer.parseInt(Extras);
		
		int totalValue=sum+ExtrasValues; // sum of total runs including Extras 
		
		System.out.println(totalValue);
		
		String actualTotal=table.findElement(By.xpath("//div[@id='innings_1']//div[contains(text(),'Total')]/following-sibling::div[1]")).getText();
		int actualTotalValue=Integer.parseInt(actualTotal);
		Assert.assertEquals(totalValue, actualTotalValue);
		/*if(totalValue==actualTotalValue)
			System.out.println("count matches");
		else
			System.out.println("count not matches");*/
		
		
	}

}

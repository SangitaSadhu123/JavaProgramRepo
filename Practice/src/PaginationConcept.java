import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PaginationConcept {
	//public static List<String> originalList=new ArrayList<String>();

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		//cpature all the webelements or xpath into List
		List<WebElement> elements=driver.findElements(By.xpath("//tr//td[1]"));  //css-> tr td:nth-child(1) //[Almond, Apple, Banana, Beans, Brinjal]
		//System.out.println(elements);
		
		
		// without using javastream:
		/*for(WebElement element:elements)
		{
		
			originalList.add(element.getText());
		}
		System.out.println(originalList);*/
		
		//capture text of all the the webelements into new(original) List
		List<String> originalList=elements.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList()); //doing sorted the list
		System.out.println(sortedList);
		originalList.stream().sorted().forEach(s->System.out.println(s));
		Assert.assertTrue(originalList.equals(sortedList),"Test is passed");
		List<String> price;
		//scan the name column with getText()-> like "Beans" -> print the price of the 'Beans'
		do
		{
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr//td[1]")); // this list again have to write because 1st time it will check from 1st page but when click on check loop will not able to get all the element from next page 
		price=elementsList.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());   // 1st filer "s" will receive all the webElement then after doing s.getText().contains("Beans")), filter will filter only webElement of Beans and map will receive only filtered webElemt which point to Beans
		price.forEach(a->System.out.println(a));
		if(price.size()<1)  // if size is < 1 then click on Next to go to next page and again perform the same searching so used do while loop
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}while(price.size()<1);          // will check size is < 1
	}
private static String getPriceVeggie(WebElement s) // now this "s" will point webElemet beans now from there we will locate price of Beans
{
	String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();  //"//tr//td[1]/following-sibling::td[1]" but //tr//td[1] is part means s which alreay we have previously
	//System.out.println(pricevalue);
	return pricevalue;  //this pricevalue go to getPriceVeggie(s) of stream
}

}

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		
		SoftAssert as=new SoftAssert();
		
		for(WebElement link:links)
		{
			String urlvar=link.getAttribute("href"); // getAttribute will return url(value) of href attribute
			
			URL u_var=new URL(urlvar);
			
			HttpURLConnection conn=(HttpURLConnection) u_var.openConnection(); // it will call url and get the response in conn obj -> conn obj will open connection
			
			//HttpURLConnection conn=(HttpURLConnection) new URL(urlvar).openConnection();
			
			conn.setRequestMethod("HEAD"); // sending request as "HEAD"
			conn.connect(); // make a connection
			int respCode=conn.getResponseCode(); // get the response code or status
			System.out.println(respCode);
			
			//Assert.assertTrue(respCode<400, "broken link" +link.getText()+ " Response code " +respCode); // directly respCode<400 if false then fail the test case
			// **** there is an issue with Assert.assertTrue(), if will fail at one point will not check rest of the links so we should use assetTrure() method SoftAssert class
			
			as.assertTrue(respCode<400, "broken link" +link.getText()+ " Response code is " +respCode);
			
			
	
			
			//alternative of using Aseert or SoftAssert
			
			/*if(respCode>400)
			{
				System.out.println("broken link" +link.getText()+ " Response code " +respCode); //link.getText() : will give the text of the URL
				Assert.assertTrue(false); // after getting the respCode checking if the respCode is true or false based on the if condition
			}*/
		}
		
		as.assertAll(); // it will return if as.assertTrue() got any failure after verifying every links

	}

}

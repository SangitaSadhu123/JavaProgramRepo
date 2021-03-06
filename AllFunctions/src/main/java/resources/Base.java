package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public WebDriver driver;
public String URL;
	public WebDriver initilizeDriver() throws IOException  
	{
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		//mvn test -Dpropertyname=value (mvn test -Dbrowser=chrome) while running using maven only just have to give value as chrome or firefox or anything in cmd
		//System.getProperty("browser") maven only checks system variable and it will check in maven command -> in jenkins in maven give [test -Dbrowser="$browser"]
		
		//String browserName=System.getProperty("browser"); // if we want to send parameter through maven command instead of writting in the test
		                                                  //now this test case is not depends on browser parameter of data.properties value
		 URL=prop.getProperty("url");
		 
		if(browserName.contains("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			if(browserName.contains("headless"))
			{
			option.addArguments("headless");
			}
			 driver = new ChromeDriver(option);


		}
		else if(browserName.equals("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	// screenshots Method
	public String getScreenShot(String tesCaseName,WebDriver driver) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		//System.getProperty("user.dir") user.dir means go to current project directory
		
		String destinationPath=System.getProperty("user.dir")+"\\reports\\"+tesCaseName+".png";// create screenshot name using test case and putting it into project
		FileUtils.copyFile(source,new File(destinationPath));

		
		return destinationPath;
		
		
	}
}

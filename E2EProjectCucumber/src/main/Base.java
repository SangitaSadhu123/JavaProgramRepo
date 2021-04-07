package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Academy.HomePage;

public class Base {
	//public static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	public String URL;
	public Properties prop;
	public WebDriver initilizeDriver() throws IOException
	{
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sangitasadhu\\Documents\\Automation\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		 URL=prop.getProperty("url");
		
		if(browserName.equals("chrome"))  // browserName=="chrome" will give NullPointerException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
			  driver=new ChromeDriver();
			
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("IE"))
		{
			//IE
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	
	
}

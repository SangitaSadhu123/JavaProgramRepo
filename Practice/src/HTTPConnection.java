import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPConnection {

	public static void main(String[] args) {
		
		DesiredCapabilities ch=DesiredCapabilities.chrome(); // to create general chrome profile 
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions option=new ChromeOptions(); // L
		option.merge(ch); // 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(" https://sitiam04.dcas.dc.gov:4446/Curam/");
	

	}

}

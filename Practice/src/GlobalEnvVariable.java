import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnvVariable {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));  // to read from file
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox"); // to change value at run time
		System.out.println(prop.getProperty("browser"));  
		FileOutputStream fout=new FileOutputStream("C:\\Users\\sangitasadhu\\Documents\\Automation\\Practice\\config.properties");
prop.store(fout, null); // no comments  // to update congig file as well
	}

}

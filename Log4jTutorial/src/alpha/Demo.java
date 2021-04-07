package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//http://logging.apache.org/log4j/2.x/  
public class Demo {
private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		log.debug("Button clicked ");
		log.info("Bullon loged in successfully");
		log.error("Button is not displayed");
		log.fatal("button is missing");
		

	}

}

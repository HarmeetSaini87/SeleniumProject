package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello World ...!   \n");
		logger.trace("This is a Trace Message");
		logger.info("This is information Message");
		logger.error("This is Error Message");
		logger.warn("This is Warning Message");
		logger.fatal("This is fatal Message");
		
		System.out.println("\n   Completed");
	}

}

package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
	static Logger logger= LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		
		
		System.out.println(" Hello ");
		
		logger.trace("this is trace msg");
		logger.info("this is info msg");
		logger.error("this is error msg");
		logger.warn("this is warn msg");
		logger.fatal("this is fatal msg");
		
		System.out.println(" Completed ");
	}
}

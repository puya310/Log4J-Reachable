package com.eval.log4jreachable.log4j_reachable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	System.out.println("Hello, User");
    	logger.trace("This is running a vuln depend of log4j");
    	logger.debug("This is running a vuln depend of log4j");
    	logger.info("This is running a vuln depend of log4j");
    	logger.warn("This is running a vuln depend of log4j");
    	logger.error("This is running a vuln depend of log4j");
    	logger.fatal("This is running a vuln depend of log4j");
    }
}

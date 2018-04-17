package com.srinu;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.PatternParser;
import org.apache.log4j.spi.LoggingEvent;

public class MyPatternLayout extends PatternLayout {

	@Override
	public void activateOptions() {
		// TODO Auto-generated method stub

	}

	@Override
	public String format(LoggingEvent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ignoresThrowable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public
	  MyPatternLayout() {
	    this(DEFAULT_CONVERSION_PATTERN);
	  }

	  public
	  MyPatternLayout(String pattern) {
	    super(pattern);
	  }
	    
	  public
	  PatternParser createPatternParser(String pattern) {
	    return new MyPatternParser(
	      pattern == null ? DEFAULT_CONVERSION_PATTERN : pattern);
	  }
	
	  public
	  static void main(String[] args) {
	    Layout layout = new MyPatternLayout("[counter=%.10#] - %m%n");
	    Logger logger = Logger.getLogger(MyPatternLayout.class.getName());
	    logger.addAppender(new ConsoleAppender(layout, ConsoleAppender.SYSTEM_OUT));
	    logger.debug("Hello, log");
	    logger.info("Hello again...");    
	  }
	   
	  

}

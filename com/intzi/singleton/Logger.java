package com.intzi.singleton;

//Singleton classes ensure that we have one object of that class.
//There are cases that we don't want to create multiple objects of a class
//but only one instance.
public class Logger {

	private static Logger logger;
	private String logString = "";
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void add(String str) {
		logString += str+"\n";
	}
	
	@Override
	public String toString() {
		return logString;
	}
	
}

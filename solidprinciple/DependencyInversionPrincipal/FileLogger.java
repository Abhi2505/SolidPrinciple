package com.solidprinciple.DependencyInversionPrincipal;

public class FileLogger implements ILogger {
	//to resolve the dependecy of high level module(data acess layer ) on the low level module 
	//(file logger) we created ILogger interface containg the log method and implement in file logger class
	 public void log(String msg) {
		System.out.println(msg);
	}
}

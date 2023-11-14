package com.solidprinciple.DependencyInversionPrincipal;

public class DataAccessLayer {
	//higher level module of data acces layer is tightly coupled with the file logger 
	//if suppose in future we want to replace the file logging feature with the database logging feature 
	//then due to tight coupling it would be problem to replace from all class with filelogger.
	//the resolution can be if we depend on the abstract layer ie an interface and can inject dependency 
	//here below since depending on abstract layer leds to decoupling and satisifes the dependecy inversion 
	//principal more over for future requirement we can use any type of loggin mechnaism 
	private ILogger logger;
	public DataAccessLayer (ILogger loggermethod) {
		this.logger=loggermethod;
	}
	
	//no need for the tight coupling as in below method
	/*
	 * public void AddCustomer(String name) { //add customer to the data base
	 * FileLogger logger=new FileLogger(); logger.log("Customer added"+ name); }
	 */
}

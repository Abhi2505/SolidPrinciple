package com.solidprinciple.InterfaceSegragation;

public interface Restaurant {
	public void VegMeal();
	public void NonVegMeal();
}
class XYZVegRestaurant implements Restaurant{

	@Override
	public void VegMeal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NonVegMeal() {
		// TODO Auto-generated method stub
		
	}
	
}
//here the client is forced to implement the method that is not required 

class PQRNonVegRestaurant implements Restaurant{

	@Override
	public void VegMeal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NonVegMeal() {
		// TODO Auto-generated method stub
		
	}
	
}

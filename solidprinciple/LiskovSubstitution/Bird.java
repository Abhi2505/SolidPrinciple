package com.solidprinciple.LiskovSubstitution;

public class Bird {
//	public void fly() {
//		System.out.println("I am flying");
//	}
	public void walk() {
		System.out.println("I am walking");
	}
	public static void main(String[] args) {
		Bird b=new Parrot();
		Bird b2=new Penguin();
		//b2.fly();
	}
	//Initially we have have fly and walk method inside the bird but all birds cannot fly which leads to violation of liskov as i cannot pass any implementation of 
	//parent class(bird), so to prevent violation only common functionality kept inside bird and other attributes we can have via interface and class like Flyable
	etc
}

class FlyingBird extends Bird{
	public void fly() {
		System.out.println("Can fly");
	}
}
class Penguin extends Bird{
	
}
class Parrot extends FlyingBird{
//	public void fly() {
//		System.out.println("parrot can fly");
//	}
//	public void walk() {
//		System.out.println("Parrot can walk");
//	}
}

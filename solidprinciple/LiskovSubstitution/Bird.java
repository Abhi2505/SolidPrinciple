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

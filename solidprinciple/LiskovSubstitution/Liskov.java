package com.solidprinciple.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class Liskov {
	public static class MenuItem{
		int price;
		String name;
		String description;
		public MenuItem(int p,String n,String d) {
			this.price=p;
			this.name=n;
			this.description=d;
		}
		public double getPrice() {
			return this.price;
		}

	private double getDiscount() {
		int dis=10;
		return 0;
	}
	}
	static class BeverageItem extends MenuItem{

		public BeverageItem(int p, String n, String d) {
			super(p, n, d);
			// TODO Auto-generated constructor stub
		}
//		public double getPriceWithDiscount(int discountPercent) {
//			return this.price-(discountPercent*0.01*this.price);
//		}
		private double getDiscount() {
			int dis=10;
			return dis*0.01*this.price;
		}
		public double getPrice() {
			//System.out.println("hk");
			return this.price-this.getDiscount();
		}
	}
	public static void printItem(MenuItem item) {
//		if(item instanceof BeverageItem) {
//			System.out.println("beverage");
//			//System.out.println(((BeverageItem) item).getPriceWithDiscount(10));//vilation of likov
//		
//		}
//		else {
//			System.out.println("menuitem");
//			System.out.println(item.getPrice());
//		}
		//System.out.println("h");
		System.out.println(item.getPrice());
	}
	public static void main(String[] args) {
		//MenuItem item1=new MenuItem(60, "pen", "used to write");
		BeverageItem item2=new BeverageItem(30, "cola", "coca cola");
		//List <MenuItem>l=new ArrayList<>();
		//l.add(item1);
		//l.add(item2);	
		printItem(item2);
	}
}

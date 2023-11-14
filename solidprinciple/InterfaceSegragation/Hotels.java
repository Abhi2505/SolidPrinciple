package com.solidprinciple.InterfaceSegragation;

public class Hotels {

	class abcVegrestaurant implements VegRestaurant{

		@Override
		public void vegmeal() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class xyzNonvegrestaurant implements NonVegRestaurant{

		@Override
		public void nonVegmeal() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class QRPMixedRestaurant implements VegRestaurant,NonVegRestaurant{

		@Override
		public void nonVegmeal() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void vegmeal() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

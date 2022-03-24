package com.syntax.class13;

public class MethodsDemo4 {

	double checkDiscount(boolean isSaleon, double originalPrice, double discount) {
		if (isSaleon) {
			return (originalPrice - originalPrice * discount);

		}

		else {
			return originalPrice;

		}
	}

	public static void main(String[] args) {
		// method that takes a boolean iss sale on ( true ) give discount on price
		// if no sale same price return
		// double price double discount
		// amount of sale plus price amount

		MethodsDemo4 obj= new 	MethodsDemo4 ();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));

		
		
		
	}

}

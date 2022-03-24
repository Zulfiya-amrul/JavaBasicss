package com.syntax.class13;

public class EvenOdd {

	
	void evenOdd (int one  ) {
		
		if (one%2==0) {
			System.out.println(one + " is even number");
		}
		else {
			System.out.println(one + " is odd number");
		}
	}
	
	
	
	public static void main(String[] args) {
		//Create a method that will take a number and prints whether the number is even or odd.

		
		EvenOdd test= new EvenOdd ();
		test.evenOdd(100);
		
		
		
	}

}

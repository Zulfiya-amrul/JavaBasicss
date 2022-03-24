package com.syntax.class13;

public class larger {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	
	void largerValue ( int valueOne, int valueTwo) {
		
		if (valueOne>valueTwo) {
			
			System.out.println(valueOne + " is larger");
			
		}
		else if (valueOne<valueTwo) {
			System.out.println(valueTwo + " is larger ");
			
		}
		else {
			System.out.println("two numbers are same ");
		}
	}

	public static void main (String []args) {
		
		larger checkValues= new larger ();
		 checkValues.largerValue(3421, 987);
		
	}
}

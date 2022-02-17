package com.syntax.homeworkclass09;

public class HW3 {

	public static void main(String[] args) {
		// Create an array on integers and 
		//calculate the sum of all elements in an array
		

		int [] values= {26, 59, 63, 76, 81, } ;
		
		
		int sum=0;
		
		for ( int i=0; i< values.length; i++) {
			
			sum= sum+values [i];
			
			
		}
		
		System.out.println("the sum of all numbers is " + sum);
		
		
	}

}

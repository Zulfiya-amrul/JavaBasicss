package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// create an array and retrieve all elements in reverse order 
		
		int [] numbers= { 10, 20, 30, 40, 50, 60 } ;
		 
		for ( int i = numbers.length-1; i>=0; i--  ) {
			System.out.println(numbers[i]);
		}
		
		int[] arrs= {45,23,15,10,45,68,2,3,4};
		for(int i=0; i<arrs.length; i++ ) {
			System.out.println(arrs[arrs.length-i-1]);
		}
		
		
	
	}

}

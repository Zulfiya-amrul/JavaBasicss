package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String name = "111-222-1234";
		
		// if we want to ignore the first 3 numbers in this string 
		// we use substring- returns a string at the specified index 
		
			System.out.println(name.substring(8));
			
			// want to print only 222 nothing before or after 
			// value in index 7 is not included
			// anything starting from 4 until it reaches 7 but does not include 7 
			
			System.out.println(name.substring(4,7));
	}

}

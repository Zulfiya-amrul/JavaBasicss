package com.syntax.class15;

public class InClassTask3 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		// using loops starting at 10 going to 0 
		
		
	String str= "Sunday";
	String reversedStr = "";
	
	
	for ( int i= str.length()-1; i>=0; i--) {
	
		reversedStr= reversedStr+str.charAt(i);
		
		
	}
		System.out.println(reversedStr);
	}

}

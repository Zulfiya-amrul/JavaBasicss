package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "   Moreed  sd   "; 
		
		System.out.println(name);
		System.out.println(name.trim());
		
		
		String name2= "Run Moreed"; 
		System.out.println(name2.startsWith("Run"));
		System.out.println(name2.startsWith("Moreed")); // boolean return value method chaining (calling multiple methods on the same line ) 
		System.out.println(name2.endsWith("Moreed"));
		System.out.println(name2.toLowerCase().contains("m"));
	
	
	
	}

}

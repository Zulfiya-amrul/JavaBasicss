package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String[] cities = { "Washington DC", "Boston", "Miami", "Los Angeles ", "New York" };

		// if you have an array, you can use for each loop, to iterate/ loop through the entire array
	// specify a column : 
	// specify name of array ( cities) 
	// which type ( string ) 
	// name of the new variable string 
	
	for (String city :cities) {
		
		System.out.println(city);
		
	}
	
	System.out.println("----------");
	
	int [] numbers= { 10, 20, 30, 40 } ; 
	
	
	for (int num :numbers)  {
		System.out.println(num);
	}
	char [] grades= { 'A', 'B', 'C', 'D', 'E', 'F'} ;
	
	for (char grade: grades) {
	 
		System.out.println(grade);
	
	} 
		
	}

}

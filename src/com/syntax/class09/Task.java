package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		
		char[ ] grades= new char [6];
		 
		grades [0]= 'A';
		
		grades [1]= 'B';
		
		grades [2]= 'C';	
		
		grades [3]= 'D';
		
		grades [4]= 'E';
		
		grades [5]= 'F';
		
		System.out.println(grades[1]);
		
		System.out.println("another way");
		
		
		char [] grade= { 'A', 'B', 'C', 'D', 'E', 'F'} ;
		int size = grade.length; 
		System.out.println(size);
		
		System.out.println("Numbers of elements is = " + size);
		
		for ( int i=0; i< grade.length; i++  ) {
			
		System.out.print(grade[i] + " ");	
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

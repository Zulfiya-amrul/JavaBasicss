package com.syntax.class03;

public class IfStatesment {

	public static void main(String[] args) {
		
		
		
		/*
		 *  scenario: I need to compare 2 numbers and I have to find which is larger/bigger 
		 *  using relational operators
		 *  if is a keyword that designed for condition
		 *  dont end condition if (num1>num2) 
		 *  will need a block of codes { } 
		 *  if condition always works with boolean values
		 */ 
	 
		int num1=100;
		int num2=50;
		// we are comparing these 2 numbers and we need to have a particular output
		
	
		if (num1>num2)  { 
			System.out.println(num1 + " is larger than "+ num2); // in this case condition is true 100> 50 yes 
				
		}
	
	
		if (num1<num2)  { 
			System.out.println(num1 + " is larger than "+ num2); // no output here, because condition if false 
		}
	
	
		
		
		double money =5; 
		double coffee= 4.99;
		
		// i want to say if i have more money than the price of coffee then my output will be --> im buying coffee
		
		// we have some conditions, buying it only if we have enought money
		
		
		if ( money>coffee) { 
			
			System.out.println("I am buying coffee"); // must have {} so we can put syso inside 
			
		}
		
		
		
		
		 coffee= 5.99; // inflation coffee prices went up 
		
		 if ( money>coffee) { 
				
				System.out.println("I am buying coffee"); // must have {} so we can put syso inside 
		 }
			// we can't have an output because coffee price is more than money no output on second print 	
	
		 // if requires a boolean so it will give error if you do--> if (money=coffee) money is double, 
		 //coffee is double value, thats why error 
		 
		 
	// if (money=coffee) { Error because if conditions always must be in boolean, we used double in this case 


	
	
	
	
	
	
	
	
	}
		 
		 
		 
		 
	
	}



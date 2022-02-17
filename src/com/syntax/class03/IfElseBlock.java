package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
	

		
		int num1=100;
		int num2=500;
		
		//  which number is largest 
		
		if(num1>num2) {
			
			System.out.println(num1 + " is larger than "+ num2);
		} else {  
			System.out.println(num2 + " is larger than "+ num1);// this was executed 
		} 
		// in if else blocks only one block is executed not both only one 
		
		
		int temp=45; 
		// if temp is more than 45 i will go for a walk 
		// otherwise i will stay home 
		
		
		if (temp>=45) {
			
			System.out.println("I am going for a walk");
		}
		
		else { System.out.println("I am staying home");
		}
	
		
		/*
		 *  I need a variable that stores a gender 
		 *  if gender is f --> please use front of the train 
		 *  otherwise --> please use back of the train 
		 */
		
		char gender= 'm';
	
		
		if (gender== 'f') { 
			
			
			System.out.println("Please use front of the train");
			
		}
		
		else { System.out.println("Please use back of the train");
			
		}
		
		
		
		
		
		
		
	}

}

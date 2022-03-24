package com.syntax.replithw;

import java.util.Scanner;

public class replit76 {

	public static void main(String[] args) {

		/*
		 * Write a program that creates a String array with size 7.
		 * Ask the user to input Days of a week beginning with Sunday using Scanner
		 * class.
		 * Add these inputs to your array and then print all values from that array 
		 * Example:
		 * Please enter day 1 of the week
		 * Sunday
		 * Please enter day 2 of the week
		 * Monday
		 * Please enter day 3 of the week
		 */

		//String[ ]array = new String [7];
		
		//Scanner scan= new Scanner (System.in); 
		
		//System.out.println("Please enter day 1 of the week");
		
		//String days= scan.next();
		
		int no; // the number of friends the user has, will get input from use
		
		Scanner input = new Scanner (System.in);
				
		
		 
		 String []names = new String [7];
		 
		 for (int counter =0; counter< 7; counter++ ) {
			 
			System.out.println("enter the name of friend" + (counter +1));
			names [counter]= input.next();
			
		 }
		 
		input.close();
		
		
		 System.out.println("your frineds are ");

		 for (int counter =0; counter< 7; counter++ ) {
			 
			
			System.out.println(names[counter]);
			
			
		 }
		 
		
		
		
		
		
		
		
		
		
		
	}
}

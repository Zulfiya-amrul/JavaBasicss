package com.syntax.homework.class06;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		//A-Excellent, B-Good, C-Average, D-Bad, 
		//any other grade --> Not Acceptable.
		//At the end your program should print which grade was entered by a user with explanation.

		
		
		Scanner imput= new Scanner (System.in); 
		
		System.out.println("Please enter your grade.");
		
		String Grade=imput.next();
		
		String Reaction;
		
		switch (Grade.toLowerCase()) {
		
		case "a" :
			Reaction = "Excellent!"; 
		break; 
		
		case "b" :
			Reaction = "Good."; 
		break;
		
		case "c" :
			Reaction = "Average."; 
		break; 
		
		case "d" :
			Reaction = "Bad."; 
		break; 
		
		default: 
			Reaction= "Not acceptable.";
		}
		
		
		
		System.out.println("You have entered grade "+ Grade+ " this grade is " + Reaction);
	
	imput.close();	
		
	}

}

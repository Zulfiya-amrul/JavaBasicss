package com.syntax.homework.class05;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		// tall(over 72 inch)


	Scanner measurements= new Scanner (System.in); 
		
		System.out.println("Please enter your height in inches.");
		
	int h= measurements.nextInt();
	
		if (h<=60) {
			System.out.println("You are classified as short.");
		}
		else if ((h>=60) && (h<=72)) {
			System.out.println("You are classified as medium");
		}
			
		else if (h<=72) {
			System.out.println("You are classified as tall");
		}
		
	}

}

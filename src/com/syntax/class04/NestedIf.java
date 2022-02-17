package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = false;
		int dose = 2;

		if (vaccine) {

			System.out.println("How many doses do you have");

			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated");
			}
		}

		else {
			System.out.println("I dont have any further questions");
		}
		// only if the outer condition is true the it will enter inside the code

		// nested if inside if else block----------------------------------------

		/*
		 * declare a variable for allergy if you have allergy if you have pollen if you
		 * have peanut if you have wheat if no allergy --> you are lucky
		 * 
		 * set up if statement and else statement before nesting
		 */

		boolean allergy = true;

		if (allergy) {// outer if statemenet 
				System.out.println("Lets check what allergies you have");
	
				String allergyType = "pollen";
				// this is nested if, nested if always have dependency on the other if
				// outer if MUST be true in order for nested if to be checked
				if (allergyType.equals("pollen")) {// string.equals ("name")) this is how you convert string to a boolean
	
					System.out.println(" Please stay at home when trees are blooming, Take medication A");
				} else if (allergyType.equals("peanut")) {
					System.out.println("Please dont eat food that contain nuts. Take med B");
				} else if (allergyType.equals("gluten")) {
					System.out.println("please follow gluten free diet. Take medication C.");
				} else {
					System.out.println("I dont know which suggestion to give you");
				}

		} else {
			System.out.println("You are lucky");
		}

	}
}

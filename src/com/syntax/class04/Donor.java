package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		// //Create a Java program and call it a Donor.
		// -In order to be eligible to donate your blood you have to be 18 years old.
		// Also once you identify age eligibility then we have to see if person matches
		// weight requirements.
		// If person weight it more than 110 lbs → then he/she is eligible, otherwise we
		// cannot accept such a patient.

		int age = 33;

		int weight = 55;

		if (age >= 18) {

			System.out.println("You might be eligible to donate blood.");
			if (weight >= 110) {
				System.out.println("You are elibible to donate blood based on your weight.");
			} else {
				System.out.println("You are not eligible to donate blood because you're under weight.");
			}

		}

		else {
			System.out.println("You are not eligible to donate blood because you're under the age.");
		}

	}

}

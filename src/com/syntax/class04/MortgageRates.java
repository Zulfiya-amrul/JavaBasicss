package com.syntax.class04;

public class MortgageRates {

	public static void main(String[] args) {
		// Create a Java program and store values of mortgage rate and mortgage price.
		// First, program should check if rate is higher than 4.5
		// user will not buy a house,
		// otherwise user will consider buying.
		// Once user decides to buy a house,
		// if price of the house is larger than 50000 than user will take a loan,
		// otherwise user will pay cash.

		double mortgageRate = 3.5;
		int housePrice = 4500;
		if (mortgageRate >= 4.5) {
			System.out.println("You will not buy a house.");
			
		} else {
			System.out.println("You should consider buying a house.");
			if (housePrice > 5000) {
				System.out.println("you should take a loan");
			} else {

				System.out.println("you can pay cash");
			}
		}

	}

}

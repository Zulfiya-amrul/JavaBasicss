package com.syntax.homework.class04;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {

		Scanner loan = new Scanner(System.in);

		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed.
		// If loan is less or equal to 200,000 then you would lend the money
		// otherwise you would reject the client.

		System.out.println("What amount of loan is needed.");

		int loanAmount = loan.nextInt();

		if (loanAmount <= 200000) {

			System.out.println("Congradulations, you have been approved for a loan.");

		} else {
			System.out.println("Sorry, you are not qualified for the loan.");
		}

		loan.close();

	}

}

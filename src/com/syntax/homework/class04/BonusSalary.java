package com.syntax.homework.class04;

import java.util.Scanner;

public class BonusSalary {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual
		// salary.
		// ==If user worked for more or equals to 5 years than user is eligible for the
		// bonus,
		// ==otherwise he is not.
		// Once user is eligible and salary is larger than 50000 than bonus = 5000,
		// otherwise bonus=3000.

		Scanner user = new Scanner(System.in);

		System.out.println("Please enter number of worked years.");

		int years = user.nextInt();

		if (years >= 5) {
			System.out.println("You are eligible for a bonus.");

			System.out.println("Please enter your salary amount.");

			int salary = user.nextInt();

			if (salary >= 50000) {

				System.out.println("Congradulations you get a 5000 bonus.");

			} else {
				System.out.println("your bonus is 300.");
			}
		}

		else {
			System.out.println("Sorry you are not eligible for a bonus.");
		}
	}
}

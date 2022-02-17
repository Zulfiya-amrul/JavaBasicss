package com.syntax.homework.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.
		// Please complete this assignment in 2 ways: using if statement and switch
		// case.

		Scanner calc = new Scanner(System.in);
		System.out.println("Please enter your first value.");
		int val1 = calc.nextInt();

		System.out.println("Please enter desired operation:+,-,*,/");
		char op = calc.next().charAt(0);

		System.out.println("Please enter your second value.");
		int val2 = calc.nextInt();

		if (op == '+') {
			System.out.println((val1 + val2) + " is your answer.");
		} else if (op == '-') {
			System.out.println((val1 - val2) + " is your answer.");
		} else if (op == '*') {
			System.out.println((val1 * val2) + " is your answer.");
		} else if (op == '/') {
			System.out.println((val1 / val2) + " is your answer.");
		}

		else {
			System.out.println("Invalid entry.");
		}
		int answer = 0;
		switch (op) {
		case ('+'):
			answer = (val1 + val2);
			break;
		case ('-'):
			if (val2!=0) {
				answer = val1/val2;
			}
			answer = (val1 - val2);
			break;
		case ('*'):
			answer = (val1 * val2);
			break;
		case ('/'):
			answer = (val1 / val2);
			break;

		} System.out.println("Your answer is " + answer);
calc.close();

	
	}

}

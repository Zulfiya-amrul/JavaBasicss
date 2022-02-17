package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			System.out.println("Hello " + i);

		}

		System.out.println("    MULTIPLICATION TABLE     ");

		/*
		 * 3X1=3 3X2=6 3X3=9 ONLY the second value changes, the first one stays
		 * constatnt, how to make it work is make the second value change
		 */

		int num = 7;
		int result;

		for (int i = 1; i <= 10; i++) {
			result = num * i;

			System.out.println(num + " x " + i + " = " + result);
		}

		System.out.println("-- WHAT IS THE OUTPUT---");

		int value = 1;
		for (int i = 1; i < 4; i++) {
			value *= i;
		}

		System.out.println(value);

		// sum of all numbers

		/*
		 * i want to find out the sum of all even and all odd numbers from the range
		 * 1-50
		 * 
		 */

		int summ = 0;
		int sumOdd=0; 
		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				summ = summ + i;

			}
			else { 
				sumOdd= sumOdd +i; 
			}

		}System.out.println(summ);
		System.out.println(sumOdd);

	}
}

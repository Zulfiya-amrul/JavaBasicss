package com.syntax.homework.class04;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// Write a program to find largest number among three numbers using nested if
		// provided by a user (numbers must be distinct)

		Scanner number = new Scanner(System.in);

		System.out.println("Please provide the first value.");

		int first = number.nextInt();

		System.out.println("Please provide the second value.");

		int second = number.nextInt();

		System.out.println("Please provide the third value.");

		int third = number.nextInt();

		if (first > second) {
			if (first > third)
				System.out.println("The largest number is " + first);
			
			} 
		else if (third > second) {
				if (third > first) {
					System.out.println("The largest number is " + third);
				}

		}
		else if (second > first) {
			if (second > third) {
				System.out.println("The largest number is " + second);
			}
		
number.close();

	}

}
}

package com.syntax.homework.class04;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {

		// You are DMV representative and you need to ask customer their age.
		// If they are 18 and older you will issue a driver license to them,
		// otherwise you will offer them to get a learners permit.

		Scanner age = new Scanner(System.in);

		System.out.println("Please enter your age");

		int number = age.nextInt();

		if (number >= 18) {

			System.out.println("Congradulations you can recieve your license. ");
		} else {
			System.out.println("Pleas apply for a learners permit.");
		}

		age.close();

	}

}

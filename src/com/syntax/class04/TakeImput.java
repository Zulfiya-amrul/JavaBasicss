package com.syntax.class04;

import java.util.Scanner;

/*
 * to import in mac - command shift +o
 */
public class TakeImput {

	public static void main(String[] args) {

		// 1. create a scanner and assign to a variable

		Scanner scan = new Scanner(System.in);
		// 2. specify the instructions
		System.out.println("Please enter country where you are from.");

		// 3. we need to capture String value ---> use next();

		String country = scan.next();
		System.out.println("You are from " + country);

		// if you are from usa you spreak english
		// if you are from france you speak french

		if (country.equalsIgnoreCase("USA")) {
			System.out.println("You speak English");

			} else if (country.equalsIgnoreCase("France")) {
				System.out.println("You speak French");
			} else if (country.equalsIgnoreCase("Turkey")) {
				
				System.out.println("You speak Turkish");
			}
		
		else {
			System.out.println("i dont know which language you speak");

		}

	}

}

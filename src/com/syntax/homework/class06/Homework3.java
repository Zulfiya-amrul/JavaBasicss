package com.syntax.homework.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		// -Write a program to ask user to enter value for sale: yes or no
		// -if there is no sale --> you are not going for shopping
		// -if there is sale ask you user for the price of the item
		// Based on the price you have to calculate the price of the item after the
		// discount
		// if price is less than $20 --> apply 10% discount
		// if price is between $20 & $100 --> 20% discount
		// if price between $100 & $500 --> 30% discount
		// otherwise apply 50% discount
		// Output of the program should be:
		// After discount ___ the price of the item reduce from __ to ___

		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale, enter yes/no.");

		String Sale = input.next();

		if (Sale.equalsIgnoreCase("yes")) {

			System.out.println("What is the price of the item?");

			double price = input.nextDouble();

			double perc;

			if ((price < 20) && price >= 1) {
				perc = .1;
			} else if ((price >= 20) && (price <= 100)) {
				perc = .2;
			} else if ((price > 100) && (price <= 500)) {
				perc = .3;
			} else {
				perc = .5;
			}

			double calculate = price * perc;
			double afterDiscount = price - calculate;

			System.out.println("After " + perc + " discount the price of the item reduced from " + price + " to "
					+ afterDiscount);

		}

		else {
			System.out.println("You are not going shopping.");
		}
		input.close();

	}
}

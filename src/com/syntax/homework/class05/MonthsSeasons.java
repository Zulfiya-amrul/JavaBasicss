package com.syntax.homework.class05;

import java.util.Scanner;

public class MonthsSeasons {

	public static void main(String[] args) {
		// 4. Write a program for user to enter his/hers birth month. Based on the month
		// define the season.
		// Example: if user is born in March, April, May → season =“Spring” 
		// if user is born in June, July, August → season =“Summer”  etc …

		Scanner done = new Scanner(System.in);

		System.out.println("Please enter your birth month.");

		String month = done.next();

		if ((month.equalsIgnoreCase("December")) || (month.equalsIgnoreCase("January"))
				|| (month.equalsIgnoreCase("February"))) {
			System.out.println("You were born in the winter season.");
		}

		else if ((month.equalsIgnoreCase("March")) || (month.equalsIgnoreCase("April"))
				|| (month.equalsIgnoreCase("May"))) {
			System.out.println("You were born in the spring season.");
		}
		
		else if  ((month.equalsIgnoreCase("June")) || (month.equalsIgnoreCase("July"))
				|| (month.equalsIgnoreCase("August"))) {
			System.out.println("You were born in the summer season.");
		}
		else if  ((month.equalsIgnoreCase("September")) || (month.equalsIgnoreCase("October "))
				|| (month.equalsIgnoreCase("November"))) {
			System.out.println("You were born in the fall season.");
		}
		
		else {
			System.out.println("Invalid entry.");
		}
	}

}

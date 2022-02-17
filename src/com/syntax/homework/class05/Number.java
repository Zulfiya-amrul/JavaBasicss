package com.syntax.homework.class05;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number and then define if number is small, medium or
		 * large 
		 * Small number is value between 1 and 10
		 * Medium number is value between 11 and 100
		 * Large number is value between 101 and 1000
		 * 
		 * find out the largest number out of 3 given numbers 
		 * and then define weather largest number is even or odd 
		 */

		Scanner num = new Scanner(System.in);
		
		int largest; 

		System.out.println("Please enter a number.");

		int value = num.nextInt();
		
		if ((value>=1) && (value<=10)) {
			System.out.println("The entered number is small.");
		}
		else if ((value>=11) && (value<=100)) {
			System.out.println("The entered number is medium.");
		}
		else if ((value>=101) && (value<=1000)) {
			System.out.println("The entered number is large.");
		}
		else {
			System.out.println("Invalid entry.");
		}
	}

}

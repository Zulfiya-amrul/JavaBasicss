package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		// Write a Java program to add, subtract,
		// multiply and divide 2 decimal values.
		// Your program should say.
		// “The _______ of 2 numbers ___ and ___ is equal to _____”

		double n1 = 5.5;
		double n2 = 6.6;

		double add = n1 + n2;
		double sub = n1 - n2;
		double mul = n1 * n2;
		double div = n1 / n2;

		System.out.println("The addition of " + n1 + " and " + n2 + " is eaqual to " + add);
		System.out.println("The subtraction of " + n1 + " and " + n2 + " is eaqual to " + sub);
		System.out.println("The multiplication of " + n1 + " and " + n2 + " is eaqual to " + mul);
		System.out.println("The division of " + n1 + " and " + n2 + " is eaqual to " + div);

		double n3 = 3.9;

		double square = n3 * n3;
		System.out.println("The square of 3.9 is  " + square);

		int w = 5;
		int h = 8;

		int per = 2 * (w + h);
		int area = (h * h);
		System.out.println("The perimiter of a rectangle with width " + w + " and height " + h + " is " +per);
		System.out.println("The area of a rectangle with width " + w + " and height " + h + " is " + area);

		/*
		 * shortcut to format the code : mac command + shift +f 
		 */

		
		
	}

}

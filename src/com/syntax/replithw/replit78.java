package com.syntax.replithw;

import java.util.Scanner;

public class replit78 {

	public static void main(String[] args) {

//Create an array of integers 
//that will store 5 elements taken from a user

//Don't print any prompt message for the user

//Then print out all the elements you have created
//in the first loop in reverse order.	

		int size = 5;
		Scanner scan = new Scanner(System.in);

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("value of " + i);
			array[i] = scan.nextInt();

			System.out.println(array[i]);
		}

		for (int i = 0; i < size; i++) {
			array[i] = (i+1) * 10;
			System.out.println(array[i]);
		}

	}

}

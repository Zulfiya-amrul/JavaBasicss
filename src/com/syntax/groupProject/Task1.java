package com.syntax.groupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array on int values using a scanner and 
		 * calculate the sum of all stored elements in that array.
		 * 
		 * 1. create an int array using scanner class from user
		 * create an it array of above size
		 * fill the array with eleents from the user using scanner class
		 * sum all the elements of the array
		 * a calss that helps user take the input from the keyboard
		 * 
		 */
		
		Scanner scan= new Scanner (System.in); 
		System.out.println("Please enter the size of the array");
		int size=scan.nextInt();
		System.out.println("the size of the array"+ size);
		// 2) create an int array of above size 
		
		int[] array = new int [size];// better to follow java style but this works too int array []= 
		
		// 3) fill the array with elements from the user using scanner class
		
		System.out.println("please enter the elements of the array if size"+ size);
		for (int i=0; i<size; i++) {
			System.out.println("please enter the element for index"+ i); 
			array [i]= scan.nextInt();
		}
		
		//print out the elemnts oof array without a loop
		System.out.println(Arrays.toString(array));
		
		// 4) sum all the elements of the array
		int sum=0;
		
		for ( int x=0; x<size; x++) {
			sum= sum+array [x];
			// shorter way--> sum ++array[x]
		}
		
		System.out.println("Sum of array elentes is "+sum);
		
		
		
	}

}

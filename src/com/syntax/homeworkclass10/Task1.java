package com.syntax.homeworkclass10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	//  (Shahima) Create an array on int values using a scanner 
		//and calculate the sum of all stored elements in that array.

		
		
			  
		   System.out.println("Enter the required size of the array:");
		   Scanner scan = new Scanner(System.in);
		   int numbers = scan.nextInt();
		   int myArray[] = new int [numbers];
		   int sum = 0;
		   System.out.println("Enter the elements of the array");
		   for(int i=0; i<numbers; i++){
		   	 
		     myArray[i] = scan.nextInt();
		     sum = sum + myArray[i];
		   }
		   System.out.println("The sum of the given array is "+sum);
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}

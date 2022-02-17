package com.syntax.homeworkclass10;

public class Task4GroupProject {

	public static void main(String[] args) {
		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even
		// and odd numbers for that array.

		int[][] twoDArray = { { 5, 6, 7, 8, 9 }, // index 0
				{ 15, 16, 17, 18, 19 }, // index 1
				{ 25, 26, 27, 28, 29 } // index 2

		};
		int sumOfEven=0;
		int sumOfOdd=0;

		for (int[] eachArray : twoDArray) {

			for (int eachElementOfArray : eachArray) {

				if (eachElementOfArray % 2 == 0) {
					
					System.out.println(eachElementOfArray + " ");

					sumOfEven=sumOfEven + eachElementOfArray;
					
					
				}
				
				
				
				

			}
		}

		
		System.out.println(sumOfEven+ " ");
		
		
		//else if (!( eachElementOfArray % 2 == 0)){
		//System.out.println(eachElementOfArray + "");
	//}

		
		
		
		
	}

}

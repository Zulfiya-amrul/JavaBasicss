package com.syntax.homeworkclass09;

public class HW4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] values = { 26, 59, 163, 76, 81, };

		int largestNumber = values[0];

		for (int i = 1; i < values.length; i++) {

			if (values[i] > largestNumber) {

				largestNumber = values[i];
			}

		}
		
		
		System.out.println("The largest number is " + largestNumber);
		
		
		largestNumber = values[0];
		for (int num:values) {
			if (num > largestNumber) {
				largestNumber=num;
			}
			
		}
		
		System.out.println("The largest number is " + largestNumber);

		
	}

}

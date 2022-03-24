package com.syntax.groupProject;

public class task8 {

	public static void main(String[] args) {
		// maximum and minimum number from the array

		int[] arr = { 10, 20, 30,90, 50, 70 };
		int largest=arr[0];
		int smallest=arr[0];
		
		
		for (int elements: arr) {
			
			if (elements>largest) {
				
				largest=elements;
			}
			if (elements<smallest) {
				smallest=elements; 
			}
		}

		System.out.println("Largest number is "+ largest);
		System.out.println("smallest number "+ smallest);
		
	}

}

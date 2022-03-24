package com.syntax.groupProject;

public class Task4 {

	public static void main(String[] args) {
		// check if element is even
		// if it is add it to sumEven variable 
		// if its odd number then add it to sumOdd

		int[][] array2D = { { 2, 3, 4 }, { 5, 6}, { 12, 6, 8 } };
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int x = 0; x < array2D.length; x++) {
			
			for (int y = 0; y < array2D[x].length; y++) {
				int element=array2D[x][y];
				if(element%2==0) {
					sumEven+=element;
					
					System.out.println(element);
				}else {
					sumEven+=element;
				}
			}
		}
		System.out.println("Sum of even numbers "+ sumEven);
		System.out.println("Sum of odd numbers "+ sumOdd);

	}

}

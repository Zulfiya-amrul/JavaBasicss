package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		

		for (int i = 1; i <= 4; i++) {
			System.out.println("A");

		}

		System.out.println("----------------");

		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iterations of inner loop

			for (int j = 1; j <= 3; j++) { // inner loops always depend on outer loop
				System.out.println("hello");
				break; 
			}

			System.out.println("good morning");
			
		}

		
		
		
		
		
		
		System.out.println("-------last---------");

		for (int i = 0; i <= 2; i++) {
			
			for (int j = 1; j <= 2; j++) {
				if (j == 2) {
					System.out.println("good morning ");
				}
				
				System.out.println("hello");
			}
			

		}

	}

}

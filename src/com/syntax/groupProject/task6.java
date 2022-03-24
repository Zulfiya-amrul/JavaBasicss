package com.syntax.groupProject;

public class task6 {

	public static void main(String[] args) {
		// write a java program to check whether a given number is prime or not 
		// if a number is not greater than 1 it is not prime 
		// if 
		

		int number=10;
		boolean isPrime= true;
		
		if (number > 1) {
			for (int i=2; i<number; i++) {
			if (number%i==0) {
				isPrime= false;
				break;
				
			}
			}
				
		}
		else {
			isPrime=false;
		}
		
		
		System.out.println(number+ " isPrime "+ isPrime);
		
	}

}

package com.syntax.class13;

public class Prime {

	Boolean isPrime(int num) {

		boolean isPrime = true;
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}
		return isPrime;

	}

	public static void main(String[] args) {
		
		Prime objectName = new Prime ();
		System.out.println(objectName.isPrime(12));

	}

}

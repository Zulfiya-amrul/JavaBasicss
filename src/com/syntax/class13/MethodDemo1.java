package com.syntax.class13;

import java.util.Scanner;

public class MethodDemo1 {

	void checkEvenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

	void checkWeather(boolean isRaining) {
		if (isRaining) {
			System.out.println("i am staying home");

		} else {
			System.out.println("lets go for a walk ");
		}
	}

	void checkName(String name) {
		if (name.equals("Teyfur")) {
			System.out.println("lets send memes ");
		} else if (name.equals("Maha")) {
			System.out.println("i am a doctor ");
		} else {
			System.out.println(" I dont know you ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo1 object1 = new MethodDemo1();

		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.checkEvenOdd(74);
		object1.checkWeather(false);
		object1.checkName("zulfiya");
		object1.checkName("Maha");
		object1.checkName("Teyfur");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		// int number

	}

}

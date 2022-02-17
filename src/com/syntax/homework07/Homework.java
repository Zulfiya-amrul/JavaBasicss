package com.syntax.homework07;

public class Homework {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("      -        ");
		// Print numbers from 100 to 1

		for (int v = 100; v >= 1; v--) {
			System.out.print(v + " ");
		}

		System.out.println("   --      ");
		// Print even numbers from 20 to 1 (2 ways) (the two ways are i++ and with mod %
		// y += 2;ex !(v % 2 == 0))

		for (int b = 20; b >= 1; b -= 2) {
			System.out.print(b + " ");
		}
		System.out.println("other way");

		int c = 20;

		while (c >= 1) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c--;
		}
		// Print odd numbers between 20 and 50 (2 ways)

		for (int u = 20; u <= 50; u += 2) {
			System.out.print(u + " ");
		}
		System.out.println("other way");

		int e = 20;

		while (e <= 50) {
			if (e % 2 == 0) {
				System.out.print(e + " ");
			}
			e++;

		}

	}

}

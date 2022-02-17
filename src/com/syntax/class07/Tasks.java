package com.syntax.class07;

public class Tasks {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space

		int l = 1;

		while (l <= 100) {
			System.out.print(l + " ");
			l++;
		}
		System.out.println("---------------  ");
		// Print numbers from 100 to 1
		int e = 100;
		while (e >= 1) {
			System.out.println(e);
			e--;
		}
		System.out.println("---------------  ");

		// Print even numbers from 20 to 100 

		int y = 20;
		while (y <= 100) {

			System.out.println(y);
			y += 2;

		}

		System.out.println("---------------  ");

		// Print only odd numbers from 100 to 1

		int v = 100;

		while (v >= 1) {

			if (!(v % 2 == 0)) {
				System.out.println(v);

			}
			v--;

		}
		int i=7;
		while (i<=98) {
		  System.out.println(i);
		  i+=7; 
		}
	
	}

}

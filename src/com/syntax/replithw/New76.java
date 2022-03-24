package com.syntax.replithw;

import java.util.Scanner;

public class New76 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 7;

		String[] days = new String[num];

		for (int i = 0; i < num; i++) {

			System.out.println("please enter day " + (i+1) + " of the week");

			days[i] = input.next();

		}

		input.close();
		for (int i = 0; i < num; i++) {
			System.out.println(days[i]);
		}

	}

}

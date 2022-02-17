package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group.
		// Then print your name from that array. (use 2 different ways of creating an
		// array).

		String[] names = new String[4];

		names[0] = "Ali";
		names[1] = "Aysha";
		names[2] = "Mustafa";
		names[3] = "Zulfiya";

		System.out.println(names[3]);

		System.out.println("different way");

		String[] name = { "Ali", "Aysha", "Mustafa", "Zulfiya" };
		System.out.println(name[3]);

		// good example learn this

		String[] cities = { "Washington DC", "Boston", "Miami", "Los Angeles ", "New York" };

		// use length to see how many elements are in an array
		// how to find size

		System.out.println(" ----important learn this---- ");
		// if value is miami --- i want to say i want to live in miami

		for (int a = 0; a < cities.length; a++) {
			System.out.println(cities[a]);

			if (cities[a].equals("Miami")) {
				System.out.println("I want to live in Miami");
			}
		}

	}

}

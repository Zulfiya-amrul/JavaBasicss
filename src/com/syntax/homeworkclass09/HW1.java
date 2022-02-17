package com.syntax.homeworkclass09;

public class HW1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it.
		// Using 2 different loops print all values from the array.

		String[] cars = { "Toyota", "Honda", "Ford", "Subaru", "Chevrolet", "Tesla" };

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("----another way----");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}

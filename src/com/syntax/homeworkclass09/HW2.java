package com.syntax.homeworkclass09;

public class HW2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it.
		//Using 2 different loops print all elements from the array.

		String [ ] animals = { "Horse", "Lion", "Zebra", "Cat", "Monkey", "Whale"} ;
		
		for (String animal: animals ) { 
			System.out.println(animal);
		}
		
		System.out.println("---another way----");
		
		
		for ( int i =0; i<animals.length; i++) {
			
			System.out.println(animals[i]);
		}
		
	}

}

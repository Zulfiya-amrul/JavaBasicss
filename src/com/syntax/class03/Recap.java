package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dayTime = "morning";

		int date = 22;
		String month = "January";
		// today is morning of January 22.

		// + as a concatination operator used to attached string to any other PRIMITIVE
		// data types
		// we have 2 types of date types in java - primitive and non primitive
		// in primitive we have 8 data types
		// attach string to another primitive data type

		String sentence = "Today is " + dayTime + " of " + month + " " + date; // this can be in
																				// string data type

		// we can assign this sentence inside a string variable

		System.out.println(sentence);
		System.out.println(2022);

		System.out.println("2022"); // if you use string you cant add values to sum

	}

}

package com.syntax.class04;

import java.util.Scanner;// we need to import Scanner into our class 

public class UserImput {

	public static void main(String[] args) {
		// instead of me manually specifiying int =10 so on we can do it automatically
		// with the help of scanner (
		// scanner is from the class like string is a class
		// scanner is also a type of non primitive data type

		Scanner input = new Scanner(System.in);// need to memorize this

		System.out.println("Please enter your name.");

		// if you want to capture single String--> use next ( );

		String name = input.next();// type string and hit enter
		System.out.println(name);

		System.out.println("Your name is " + name + ".");

		// if you want to capture integer value --> use nextInt( );
		System.out.println(name + " Please enter your age.");

		int age = input.nextInt();

		System.out.println("Your name is " + name + " and your age is " + age + ".");

		input.close();

	}

}

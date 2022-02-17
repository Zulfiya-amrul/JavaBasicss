package com.syntax.homework07;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		//  Ask a user to enter name, last name and age 5 times. 
		//Every time your program should print those values in a format
		//“You name is _ _ and you are _ years old’
		
		Scanner scan=new Scanner (System.in); 
		String Name;
		String Last;
		int age; 
		
		for (int i=1; i<=5; i++) {
			System.out.println("Please enter your name:");
			Name=scan.next();
			
			System.out.println("Please enter your last name:");
			Last=scan.next();
			
			
			System.out.println("Please enter your age: ");
			age=scan.nextInt();
			
			
			
			System.out.println("Your name is "+ Name+ " " +Last + " and you are "+ age + " years old.");
		}
			
		
		
		scan.close();
		
	}

}

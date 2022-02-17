package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberUsingWhile {

	public static void main(String[] args) {
		/*
		 * create a secret number 
		 * 45
		 * we want user to guess our secret number 
		 * the moment user guessed my secret number my program should stop
		 * otherwise it should continue asking to guess my number 
		 * 
		 */

		
		int secretNumber=12;
		
		Scanner input=new Scanner(System.in);
		int guessNumber;
		
		System.out.println("Please enter a number to win");
		guessNumber=input.nextInt();
		
		
		while (guessNumber!=secretNumber) {
			System.out.println("Please enter a number to win");
			guessNumber=input.nextInt();

			
		}
		
		
		
		do {
		System.out.println("please enter a number to win");
		guessNumber=input.nextInt();
		
		} while (guessNumber!=secretNumber);
			System.out.println("please enter a number to win ");
			guessNumber=input.nextInt();
			
			System.out.println("congrats");

input.close();
		}
	
		
		
	}



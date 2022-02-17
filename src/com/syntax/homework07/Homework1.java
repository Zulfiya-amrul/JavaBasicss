package com.syntax.homework07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Declare a variable to store a price for a coffee.
		//Ask user to pay for a coffee. 
		//Keep asking to pay for coffee until user enters exact amount . 
		//If user give more than $3 --> ask them to give less, 
		//if user gives less money then ask to give more.
		//Once user got a write amount print “Please enjoy your candy”
		
		Scanner scan=new Scanner (System.in); 
		
		
		double price=3;
		double pay;
		
		System.out.println("Please pay for coffee.");
		do {
			
			pay=scan.nextDouble();
			if (pay>price) {
				System.out.println("Please give less");
			}
			else if (pay<price) {
				System.out.println("Please give more");
			}
			
		} while (pay!=price);
		
		
		
		
			System.out.println("Please enjoy your coffee. ");
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		

	}

}

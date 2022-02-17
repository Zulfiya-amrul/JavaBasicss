package com.syntax.homework.class04;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print 
		//“The temperature is the city __ is __”
		//Celsius = ((f-32)*5)/9;
		
		Scanner information= new Scanner (System.in); 
		
		System.out.println("Please enter what city you are from.");
		
		String city=information.nextLine();
	
		System.out.println("What is the temperature in your city?");
		
		int f=information.nextInt();
		
		int c; 
		c=((f-32)*5)/9;
		
		
		System.out.println("The temperatue in the city "+ city+" is "+ c +" celcius.");
		
		information.close();
		
		
	}

}

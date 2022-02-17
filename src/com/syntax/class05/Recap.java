package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// next () vs nextLine (); next can capture only one string, next line can capture multiple lines
		
		 Scanner scan =new Scanner( System.in);
		
		System.out.println( "capturing values using next");
		
		String value=scan.next(); // nextInt(); nextDouble, nextBoolean(): next().charAt(0); 
		
		System.out.println(value);
		
		scan.nextLine();
		
		System.out.println( "capturing values using nextLine");
		
		String anotherValue=scan.nextLine();
		
		System.out.println(anotherValue);
		
		
		
	}

}

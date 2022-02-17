package com.syntax.class10;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		//create an array of countries 
		//while retrivieving all values from an array print 
		//capital for each country 
		
	String [] countries= { "USA", "Turkey", "Canada", "Russia" }; 
	
	 String capital = null;
	for ( int i=0; i<countries.length; i++) {
		
		switch (countries[i]) {
		
		case "USA":
			capital="Washington DC";
			break;
		case "Turkey":
			capital = "Ankara";
			break;
		case "Canada":
			capital="Ottawa";
			break;
		case "Russia":
			capital = "Moscow";
			break;
				default:
				capital= "unknown";
		
		}
		
		System.out.println("The capital of the country "+ countries [i]+ " is "+ capital);
	}

	
	System.out.println("-----another way------");
		
		
		for (String country: countries) {
			if (countries.equals("USA")) {
				capital="Washington DC";
				}
			else if (country.equals("Turkey")) {
				capital="Ankara";
		}
			else if (country.equals("Canada")) {
				capital="Ottawa";
		}
			else if (country.equals("Russia")) {
				capital="Moscow";
		}
	
			
			System.out.println("The capital of the country "+ country + " is "+ capital);
		}
	}
		
}


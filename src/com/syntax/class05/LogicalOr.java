package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day= "Sunday";
		
		if (day.equals("Saturday") || day.equals ("Sunday")) {
			System.out.println("I have java class");
		}
		
	//	System.out.println("code is outside of if statement");
		
		
		/* 
		 * lets ask user what day it si today 
		 * based on the day lets adefire whick class we have 
		 * 
		 * if (monday pr friday ) --> there is no class today 
		 * 
		 * else if (tuesday wednesday) --> manual testing 
		 * 
		 * else if ( thursday ) --> review class
		 * else if ( saturday or sunday ) --> java class
		 * 
		 * 
		 */
		
		Scanner testing=new Scanner (System.in); 
		
		System.out.println("what is the day today");
		String date= testing.nextLine();
		
		
		if ((date.equalsIgnoreCase("monday"))|| (date.equalsIgnoreCase("friday"))) {
			System.out.println("I dont have class today");
		}
		else if ((date.equalsIgnoreCase("Tuesday"))|| (date.equalsIgnoreCase("Wednesday")))	{
			System.out.println("I hava manual class today ");
		}
		else if (date.equalsIgnoreCase("thursday"))	
				{
			System.out.println("I have review day today");
				}
		
		else if ((date.equalsIgnoreCase("Saturday"))|| (date.equalsIgnoreCase("Sunday")))	{
			System.out.println("I hava java class today ");
		}
		
		else {
		System.out.println("error");
		}
		
		
	}

}

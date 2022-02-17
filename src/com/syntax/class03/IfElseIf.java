package com.syntax.class03;

public class IfElseIf {

	public static void main(String[] args) {
		
		/*
		 * now here we will be checking for more conditions
		 * if you want to test multiple conditions java gives if else if block 
		 * if (condition1) {
		 * code A;
		 * } else if (condition2)
		 * code B;
		 * else (condtion 3) 
		 */

		int day = 1;
		if (day == 1) {
			System.out.println("Today is Monday");
				}
		
		else if (day ==2) {
			System.out.println("Today is Tuesday");	
		}
		else if (day==3) { 
			System.out.println("Today is Wednesday");	
		}
		else if (day==4) {   
			System.out.println("Today is Thursday");
		}
		else if (day==5 ) {   
			System.out.println("Today is Friday");
		}
		else if (day==6) {   
			System.out.println("Today is Saturday");
		}
		else if (day==7) {   
			System.out.println("Today is Sunday");
		}
		else   {   
			System.out.println("Invalid week day ");
		}
		
		
		
	}
}

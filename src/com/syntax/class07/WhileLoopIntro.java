package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 17;
		if (time < 12) {

			System.out.println("Morning");
		} // (will print the code multiple infinite amount of time because of the key word
			// while
		System.out.println("------------");
		while ( time>12) {
			System.out.println("Morning");
			time--; 
		}
		System.out.println("End of code");
		
		
		// Using while loop print numbers from 0 to 8
		
		
		int i=0;
		while (i<=8) {
			System.out.println(i);
			i++;
		}
		
		
		int b=15;
		while (b>=0) {
		  System.out.println(b);
		  b--;
		}


		int a=1;
		while (a<=13) {
			if (a%2==0) {
				System.out.println(a);
				
			}a++;

		
	}

	}}

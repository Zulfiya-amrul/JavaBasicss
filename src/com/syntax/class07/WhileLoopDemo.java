package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("The value of i "+ i);
		System.out.println("The end");
		
	// i need to print values from 2- 20 
		
		int p= 2;
		while (p<=20) {
			System.out.println(p);
			p++;
			
		}
		// i need to print values from 1- 50 
		
		int b=1;
		while (b<=50) {
			System.out.print(b+" ");
			b++;
			
		}
		
	System.out.println("----------");
	System.out.println("----------");

	
		
		// numbers from 20 - 1
		
		int c=20;
		while (c>=1) {
			
			System.out.println(c);
			c--;
			
			
		}
		
		
		System.out.println(" ---------");
		
		System.out.println(" Only only even numbers from 1 to 30 ");

		int crazy=1;
		
		while (crazy<=30) {
			if (crazy%2==0) { 
				System.out.println(crazy);
				
				
			}crazy++;
		}
		 System.out.println("--------anothe way-----");
		
		int d= 2;
		while (d<=30) {
			System.out.println(d+ " ");
			d+=2;
		}
		
		
		 System.out.println("--------anothe way-----");
		
		int e =1;
		while (e<=30) {
			if (e%2==0) {
				System.out.println(e);
			}
			e++;
		}
		
		
		
		
	}

}

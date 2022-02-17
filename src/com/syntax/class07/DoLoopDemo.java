package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=10;
		
		while (num<=3) {
			System.out.println("hello"); // will get printed 5 times
			num++;
			
		}
		System.out.println("----");
		
		
		int num1=10;
		
		do {
			System.out.println("hello");
			num1++;
			
		} while (num1<=3);  
		
		
		System.out.println(" i want to print numbers from 1 to 30 using do while loop ");
		
		
		
		int v= 1;
		
		do {
			System.out.print(v +" ");
			v++;
		} while (v<=30);
		
		
		int r=20;
		do { 
		 if (r%2==0) {

		 
		  System.out.println(r);
		} r--;

		} while (r>=1);


		
		
	}
	
	
	
	

}

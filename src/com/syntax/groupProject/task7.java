package com.syntax.groupProject;

public class task7 {

	public static void main(String[] args) {
		// write a java program to print the frist 10 number of fibonacci series
		// 0 1 2 3 5 8 13 21 34
		// store the number of  fibonacci numbrs that we want to produce 
		// start from 0 and 1
		 // add the previous numbers to procede the next number 
		
		int howMany= 20 ; 
		
		int previous=0;
		int current=1;
		int next =0;
		System.out.print(previous+ " ");
		System.out.print(current +" ");

		for (int i=0; i<howMany-2; i ++) {
			
			next= previous+ current;
			

			System.out.print(next+ " ");
			previous=current;
			current= next; 
		}
		
		
		
		
		
		
		
		
	}

}

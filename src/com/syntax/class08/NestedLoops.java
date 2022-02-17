package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int i=1; i<=3; i++ )// outer loop
			{
			System.out.println("i am i loop "+ i );
		 for ( int j=1; j<=2; j++)// nested loop 
		 {
			 System.out.println(" i am nested j loop " + j );
		 }
			 
			 
			 
			 
		}
			System.out.println("------another example-------");
			
			for (int i=1; i<=4; i++) {
				System.out.println(i);
		for (int j =1; j<3; j++)// condition is false this chunk of code doesnt run
		{
			System.out.println(j);
		}
		System.out.println("----");
		
		
			}
			
			System.out.println("------another example-------");

			
			for ( int a=0; a<=9; a++) {
				for ( int b=0; b<=9; b++) {
					for (int c=0; c<=9; c++) {
						System.out.println(a+ " " + b+" " + c);
					}
				}
					
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}

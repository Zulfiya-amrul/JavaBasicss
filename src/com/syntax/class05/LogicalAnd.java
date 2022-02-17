package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		
		boolean likeJava=true;
		boolean practice= true; 
		boolean understandJava= false; 
			
		if (likeJava && practice && understandJava ) {
			System.out.println("that is best combination");
		}
		System.out.println("end fo code");
		
		// we want to compare 3 numbers 
		/*
		 *  if       num1 > num2 && num1>num3  --> number 1 is the largest number 
		 * else if   num2 > num1 && num2>num3 ---> num2 is the largest value
		 * else if   num3> num1 && num3>num2  ---> num 3 is the largest number 
		 */
		
		int num1=1000;
		int num2=2000;
		int num3=3001;
		int largest = 0; 
		
		if (num1>num2 && num1>num3) { 
			largest=num1;
		}
		else if (num2>num1 && num2>num3) {
			largest=num2;
		}
		else if (num3>num1 && num3>num2) { 
			largest=num3;
		}
		
	System.out.println(largest);// The local variable largest may not have been initialized
		
		if (largest%2==0) {
			System.out.println(largest +" is even number" );
		}
		else { System.out.println(largest +" is odd number" );
	}
		
		
		
	}

}

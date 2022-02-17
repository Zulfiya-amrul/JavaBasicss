package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1=10;
		int num2=16;
		// using relational operators we can compare 2 numbers 
		
		System.out.println(num1>num2);   // "no" in programming is called "false" 
		System.out.println(num1==num2);   // false
		System.out.println(num1<num2);    // true 
		
		
		// the result of relational operations will always be a boolean value 
		 boolean result= num1==num2;  // ! means not != not equal to, so results is true 
		 
		 System.out.println("result is " +result);
		 
		 System.out.println(num1=num2);// one = is assignemnt operator, 
		 							// whats on the right gets assigned to whats on the left of =
		 
		 System.out.println(num1);// value of num1 changed to 16
		
		 System.out.println(num1==num2); // == is relational equality operator, comparing it 
		 								// because num1 assigned to 16 value changed to 16 
		 
		
		// any-time we use relational operator, we always get boolean value (yes or no) true or false 
		
		
		 System.out.println(num1!=num2); // not equal? false because they are equal 
		 
		 
		 
		 
	}

}

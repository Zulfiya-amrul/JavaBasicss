package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		
		// +, -, *, /, %
		
		int num=100;
				
		num =num+100;
		
		System.out.println(num);// 200
		
		num+=100; // this exact means -- this num= num+ 100 
		
		
		System.out.println(num);// 300 
		
		num-=20;
			
		System.out.println(num);// 280		
		
		num/=10; // shorter way of num=num/10
		System.out.println(num);// 28
		
		
		num%=2; 
		System.out.println(num); //1 
		
		
		//1. Declare variable and increase it’s value by 500 and then by 200 using shorthand operator 
		
		int val= 100;
		System.out.println(val);
		val+=500; // 600 
		System.out.println(val);
		
		val+=200;//800
		System.out.println(val);
		
		
		//2. Declare variable and decrease it’s value by 60 using shorthand operator
		
		int y= 300; 
		System.out.println(y);
		
		y-=60;//260
		System.out.println(y);
		
		// 3. Declare variable cakePiece=11 and divide the value of that variable between 4 people using shorthand operator

		
		int cakePiece=11;
		cakePiece/=4;
		
		System.out.println(cakePiece);
		
		//4. Declare variable cake=25 and divide cake between 7 people . 
		//Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
	
		
		
		
		int cake=25;
		cake%=7; // remainder MOD
		System.out.println(cake);
		
		
		
		
		
		
		
	}

}

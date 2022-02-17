package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// + - * / % 
		
		int num1=10;
		int num2=3;
		
		System.out.println(num1+num2); // when plus sign is places between int then it used as addition 
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); // int doenst recognize decimal numbers only  whole number thats why the result is only 3 and not 3.333
		
		
		double num3=10; // double is a data type that can recognize decimals ( can hold upto 16 decimals) 
		double num4= 6;
		System.out.println(num3/num4);
		
		float num5=10f; 
		float num6=6f;  // float can hold upto 6 decimals 
		System.out.println(num5/num6);
		
		
		// % remainder operation 
		
		int i=10;
		int j=4;
		
		System.out.println(i%j);
		
		int n1=20;
		int n2=3;
		
		int sum=n1+n2; 
		int sub=n1-n2;
		int div=n1/n2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		
		
		double d1=20; 
		double d2=3;
		
		double division= d1/d2; // more accurate for devision and remainders 
		
		System.out.println(division);
		
		
		
		
		
	}

}

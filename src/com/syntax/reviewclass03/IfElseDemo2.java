package com.syntax.reviewclass03;

public class IfElseDemo2 {

	public static void main(String[] args) {
		
		
		
		int number = 10; 
		boolean isTrue=false; 
		double number2=20;
		
		
		if (number>5) {
			if (isTrue) {
				if (number2>15) {
					System.out.println("1");
					
				} else {
					System.out.println("2");
				}
			} else {
				System.out.println("3");
				if (number2<15) {
					System.out.println("4");
				}else {
					System.out.println("5");
				}
			}
		}
		
		
		
		
		
		
		
	}

}

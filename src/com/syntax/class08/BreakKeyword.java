package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 4; i++) {
			System.out.println("I am a code inside for loop.");

			if (i == 3) {
				break; // break gets you out of the block of code. once it sees this it gets out of the
						// code
			}
		}

		System.out.println("end of the code ");

		boolean winter = true;
		int temp=0;
		while (winter) {

			System.out.println("its cold");
			if (temp == 20) {
				break;
				
			}
			temp +=5; 
		}

	}

}

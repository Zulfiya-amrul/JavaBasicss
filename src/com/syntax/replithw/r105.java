package com.syntax.replithw;

import java.util.Scanner;

public class r105 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below
		
		
		
		
		System.out.println(word.replaceAll("[^aeiouAEIOU]", ""));
	}

}

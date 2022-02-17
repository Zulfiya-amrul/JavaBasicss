package com.syntax.reviewclass2;

import java.util.Scanner;

public class Hey {

	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Do you need a loan?");
	    boolean loan = scan.nextBoolean();
	    if (loan == true) {
	      System.out.println("what is your credit score?");
	      int score = scan.nextInt();
	        if (score < 600)  {
	          System.out.println("You are not eligible to get a loan");
	        } else if (score >= 600 && score <=700) {
	          System.out.println("You may be eligible to get a loan.");
	        } else if (score >= 701 && score <=800) {
	          System.out.println("You are eligible to get a loan.");
	        } else if (score >= 801) {
	          System.out.println("You are definitely eligible to get a loan.");
	    } else {
	        System.out.println("Eligibility is unknown");
	    }
	      } 
	    }
	}

















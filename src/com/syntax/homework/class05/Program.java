package com.syntax.homework.class05;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 3. Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores)
		// and determine the grade based on the following rules: 
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F

		Scanner scores = new Scanner(System.in);

		System.out.println("Please enter your quiz score.");

		int quiz = scores.nextInt();

		System.out.println("Please enter your mid term score.");

		int midterm = scores.nextInt();

		System.out.println("Please enter your final exam score.");

		int finalexam = scores.nextInt();

		int averageScore = ((quiz + midterm + finalexam) / 3);

		System.out.println(averageScore);

		if (averageScore >= 90) {
			System.out.println("Your grade is an A.");
		}

		else if ((averageScore >= 70) && (averageScore < 90)) {
			System.out.println("Your grade is a B");
		}
		else if ((averageScore >= 50) && (averageScore < 70)) {
			System.out.println("Your grade is a C.");
		}
		else if (averageScore < 50) {
			System.out.println("Your grade is an F.");
		}

	}
}

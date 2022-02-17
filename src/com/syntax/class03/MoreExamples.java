package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		/*
		 * 
		 * we need to create a boolean variable hungry yes or no if we are hungry --> I
		 * am going to eat otherwise ---> I am going to drink tea
		 * 
		 */

		boolean hungry = false; // hungry is boolean type that already hholds true
								// for if we need boolean condition
								// so we dont need hungry==true was nessesary

		if (hungry) {

			System.out.println("I am going to eat");

		}

		else {

			System.out.println("I am going to drink tea");
		}

		boolean traffic = true;

		if (traffic) {

			System.out.println(" I am coming home late");
		}

		/*
		 * define a variable to store a browser
		 * 
		 * 
		 * if browser is chrome --> we are exceturing test on chrome otherwise -->
		 * broweser is not supported for our test/ I am not exceting any test cases
		 * 
		 * compare one string to another
		 */

		String browser = "chrome"; /// needs to have boolean , now it has string
									// converting this ways browser.equals("chrome")

		// we could use browser=="chrome" but its not preferable

		if (browser.equals("chrome")) {

			System.out.println("we are executing test on chrome");

		}

		else {
			System.out.println("we are not executing test on chrome");
		}

	}

}

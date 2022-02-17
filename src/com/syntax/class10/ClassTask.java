package com.syntax.class10;

public class ClassTask {

	public static void main(String[] args) {
	//Create a 2D array (longer way)where you will store the following values:
	//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	//After storing values print following String:
	// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String [] [] names= new String [2][4];
		// first array 
		names [0] [0]= "Mr";
		names [0] [1]= "Mrs";
		names [0] [2]= "Ms";
		names [0] [3]= "Miss";
		// second array
		names [1] [0]= "Smith";
		names [1] [1]= "Jordan";
		names [1] [2]= "Jackson";
		names [1] [3]= "Obama";
		
		
		// mrs smith
		System.out.println(names[0][1] + ". "+ names[1][0]);
		//Mr Obama
		System.out.println(names[0][0] + ". "+ names[1][3]);
		// Ms Jackson
		System.out.println(names[0][2] + ". "+ names[1][2]);
		// Miss Jordan
		System.out.println(names[0][3] + ". "+ names[1][1]);


		
	}

}

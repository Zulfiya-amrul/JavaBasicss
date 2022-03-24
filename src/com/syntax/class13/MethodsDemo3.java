package com.syntax.class13;

public class MethodsDemo3 {

	// creae a method that gives me sqare of numbers
	// not using void instead using datatype int
	// this method know what we are asking for int value
	// we can use any data type instead of int in here
	// use return keyword

	// int we specify the datatype that method will return
	// squareTheNumber naem of the method
	// (int number) parameters of the method
	// return keyword tells java what to return from this method

	int squareTheNumber(int number) {
		return number * number;

	}

	int returnTheSameNumber(int number) {
		return number;

	}
	String getproperAnimalbyExpert (String expertName, String animalName) {
		if ("teyfur".equalsIgnoreCase(expertName)&& "Horse".equalsIgnoreCase(animalName)) {
			return "camel" ;
			
		} else if ("Horse".equals(animalName)) {
			return "Horse";
			
		} else {
			return "i dont know";
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo3 obj = new MethodsDemo3();
		int result = obj.squareTheNumber(5); // this variable will store the results after operation
		System.out.println(result);
		int result2 = obj.returnTheSameNumber(7);
		System.out.println(result2);
		System.out.println(obj.getproperAnimalbyExpert("Teyfur", "Horse"));
		// create a method that takes a person name and animal name
		// if the person name is "Teyfur" and if animal is "Horse" it returns us " camel
		// "

	}

}

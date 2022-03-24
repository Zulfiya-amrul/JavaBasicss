package com.syntax.class12;

public class Dog {
	
	// in real life if we were to create a dog it has so many different features
	// we will take few attributes and few behaviors 
	// these are the attributes of a dog class,
	// these are also called fields/ properties/ or attributes 
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	// to add behaviors we will use void key word ---> curly brackets after 
	// behaviors/ functions/ methods 
	// to define a behavior 
	
	void bark () {
		System.out.println("Dog is barking ");
	}
	
	void eat () {
		System.out.println("Dog is eating ");
	}
	
	void sleep () {
		System.out.println("Dog is sleeping");
	}

	public static void main(String[] args) {
		
			// name of the class "Dog" set up to a new variable 
		
			// creating an object scooby from class Dog 
		
		Dog scooby= new Dog (); 
		//	Scanner scan= new Scanner (System.in);
		// dog is a class
		// scooby is an object
		// = is an assignment operator 
		// new is a keyword that we use to create the object of the calss 
		// Dog () we are calling the constructor of the class 

		
		// name of the behavior 
		scooby.bark(); // "Dog is barking " will be executed because we called it in this line 
		
		// we use object to show behavior 
		
		scooby.eat(); 
		scooby.sleep ();
		
		
		
		
		
		
		
		
	}

}

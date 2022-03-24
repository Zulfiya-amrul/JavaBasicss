package com.syntax.class12;

public class Horse {
	
	// attributes, fields, properties
	String name;
	String breed;
	int age;
	double weight;
	
	
	
	//behaviors, methods, functions 
	// here we are defining the behaviours 
	void run () {
		System.out.println(name + " is running");
	}
	
	void eat () {
		System.out.println(name + " is eating ");
	}
	
	void printCompleteInfo () {
		System.out.println("name = "+ name);
		System.out.println("breed = "+ breed);
		System.out.println("age = "+ age);
		System.out.println("weight = "+ weight);
	}
	
	

	public static void main(String[] args) {
		
		
		

	// name of the class
		// these are objects because 
	Horse besh = new Horse ();
	besh.name= "spirit"; // accessing the property name  on the object besh and we are setting it to spirit 
		
	besh.breed= "stallion";
	
	besh.age= 20;
	besh.weight=400; 
	besh.run ();
	
	
	besh.printCompleteInfo(); 
	
	System.out.println("-------------");
	Horse zulisHorse= new Horse();
	
	
	zulisHorse.name = "Tuzik";
	zulisHorse.breed = "Mustang";
	zulisHorse.age = 15;
	zulisHorse.weight = 450;
	zulisHorse.run ();

	zulisHorse.printCompleteInfo(); 



	
	
	
	
	
	
	
	
	
		
	}

}

package com.syntax.class12;

public class DogClass {
	// attributes
	String name;
	String color;
	String breed;
	int age;
	char gender;
	double weight;

	// behaviors

	void printCompleteInfo () {
		System.out.println("name = " + name);
		System.out.println("color = " + color);
		System.out.println("breed = " + breed);
		System.out.println("age = " + age);
		System.out.println("gender = " + gender);
		System.out.println("weight = " + weight);

	}
	
	public static void main(String[] args) {
		// Create a Dog Class and create 3 different objects of it:
		// Husky, Bulldog, Labrador with specific attributes and behaviors.

	DogClass firstDog= new DogClass(); 	
		
	System.out.println("this is info is for first dog husky");
	firstDog.name= "Cotton";
	firstDog.color= "white";
	firstDog.breed= "husky";
	firstDog.age= 7;
	firstDog.gender= 'F';	
	firstDog.weight= 50;	
	firstDog.printCompleteInfo();
	
	System.out.println("this is info is for second dog Bulldog");
	
	DogClass secondDog = new DogClass ();
	
	secondDog.name= "Bolt";
	secondDog.color= "black";
	secondDog.breed= "Bulldog";
	secondDog.age= 12;
	secondDog.gender= 'M';	
	secondDog.weight= 120;
	
	secondDog.printCompleteInfo ();
	
	DogClass thirdDog= new DogClass();
	thirdDog.name= "Chevvy";
	thirdDog.color= "brown";
	thirdDog.breed= "Labrador";
	thirdDog.age= 3;
	thirdDog.gender= 'M';	
	thirdDog.weight= 30;
	
	thirdDog.printCompleteInfo ();
	}

}

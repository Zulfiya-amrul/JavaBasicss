package com.syntax.class12;

public class Phone {
	//attribute 
	String make;
	String model;
	int numOfCams;
	String color;
	double screenSize;
	
	// behaviors
	void printCompleteInfo () {
		System.out.println("make "+ make );
		System.out.println("model "+ model );
		System.out.println("numOfCams "+ numOfCams );
		System.out.println("color "+ color );
		System.out.println("screenSize "+ screenSize );
		System.out.println("make "+ make );
	}
	public static void main(String[] args) {
	
	Phone iphone= new Phone ();
	iphone.make= "Apple";
	iphone.model= "IPhone 13 pro max";
	iphone.numOfCams= 3;
	iphone.color="blue";
	iphone.screenSize= 6.8;
	iphone.printCompleteInfo();
		
	Phone samsung = new Phone();
	samsung.make="Samsung";
	samsung.model="Samsung Note 10";
	samsung.numOfCams=3;
	samsung.color = "black";
	samsung.screenSize = 6.6;
	
	samsung.printCompleteInfo();
	
	Phone pixel= new Phone ();
	pixel.make="pixel";
	pixel.model="google";
	pixel.numOfCams=2;
	pixel.color = "hot pink";
	pixel.screenSize = 7.3;
	
	pixel.printCompleteInfo();
	}

}

package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
// we can create objects of the phone class inside the phonetester class
		
		Phone pixel= new Phone ();
		pixel.make= "pixel";
		pixel.model= "pixel 6";
		pixel.numOfCams= 3;
		pixel.color="blue";
		pixel.screenSize= 6.8;
		
		pixel.printCompleteInfo();	
		

	}

}

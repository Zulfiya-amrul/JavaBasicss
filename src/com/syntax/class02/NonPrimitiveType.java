package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Zulfiya"; // string value is represented in double quotes
								// string is data type thats part of non primitive 
								// String is a class thats already created by java devop
		String lastName= "Amrulayeva";
								// String name if its 2 names then fist one lower case no space then upper case 
				
	long phoneNumber =1234567890; 
	
	String mobileNumber="123-456-78909"; // combination of numbers and special charactors 
	
	String num="123"; // if its inside double quotes its string 
	int num1=123;
	
	
	String greeting="Hello Friends!"; // anything inside double quotes java thinks its String 
	
	
	System.out.println(greeting);
	
	System.out.println(name);
	System.out.println(lastName);// syso+ctrl+space SHORT CUT 
	
	System.out.println(name+" "+lastName); //concatination operator / adding them together 
	
	/* using + we can concatenate 
	 * String to sting 
	 * String to int 
	 * String to boolean 
	 * String to double, char, ect...
	 * 
	 */
	int age=29; 
	// Zulfiya is years old 
	
	System.out.println(name+" is "+age+" years old");
	
	String address= "123 test street";
	// i live on .... street 
	
	System.out.println("I live on "+ address);
	
	// i like kebab
	
	String feeling="like ";
	String food= "kebab";
	
	System.out.println("I " +feeling + food);
	
			
	
	}

}

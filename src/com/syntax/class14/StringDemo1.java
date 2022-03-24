package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="shahima"; // always use this one its shorter 
		String name2 = new String ("SHAHIMA all in uppercase ");
		System.out.println(name);
		System.out.println(name2.length());
		
		
		System.out.println(name.length()); // return type of the method is int 
		String newName= name2.toLowerCase (); 
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name + name2); // you should prefer to use this method to perform concatination 
		System.out.println(name.concat(name2));// when you concat with null this method will give you error, its exeption 

		
		
		name = ""; 
		System.out.println(name.isEmpty()); // boolean value 
		
	
	}

}

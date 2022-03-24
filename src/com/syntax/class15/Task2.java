package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {

		
		String name = "How are @ you guys @ ";
		
		for ( int i=0; i< name.length (); i++ ) {
			System.out.print(name.charAt(i) + " ");
		}
		System.out.println();
		System.out.println(name.charAt(0)); // the character on the index 0 is H 
		
		System.out.println(name.indexOf("u")); // tells the starting index of the given character 
		System.out.println(name.indexOf("*")); // minus 1 because * is does not exist in this string 
		

		System.out.println(name.indexOf("@", 8+1));// start search at index 9 (ignore all previous indexes 
		System.out.println(name.indexOf("@", 19));
		
		System.out.println(name.indexOf("@", name.indexOf("@")+1));
	
		//System.out.println(name.lastIndexOf("@")); // if there are multiple same characters gives index of the last @ 
			
	}

}

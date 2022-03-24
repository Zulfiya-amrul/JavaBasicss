package com.syntax.replithw;

public class YoutubeStringBuilder {

	// we can make our string variables mutable by using class called string buffer
	// sting buffer and string builder

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Java");

		System.out.println(str);
		// string buffer is strain safe, syncronize, you can invoke 2 trains on it. used
		// only when there are train safecty requirements

		// string builder is faster in performance,

		// append // add something to the end of the string 
		
		str.append(" tutorial");
		
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.delete(0, 4);
		System.out.println(str);
		
		str.insert(0, "Java");
		System.out.println(str);
		
		str.insert (0, "c++");
		System.out.println(str);
		
		str.replace(0, 7, "angularJS");
		System.out.println(str);
		
		  StringBuffer word= new StringBuffer ("");

		  word.append("Hello");
		  word.append(" World");
		  String uppercase = word.toString().toUpperCase();
		  
		  
		  
		  
		  
		  System.out.println(uppercase);
		  
		
		
		
		
	}

}

package com.syntax.class13;

public class Hello {
	void sayHello(String Greeting) {

		String hello = null;
		switch (Greeting) {
		case "English":
			hello = "Hey";
			break;
		case "Turkish":
			hello = "Naber";
			break;
		case "Arabic":
			hello = "Ahlan";
			break;
		case "Russian":
			hello = "Privet";
			break;
		default:
			hello = "I cant say hello in your language";
		}
		System.out.println(hello);
	}
	public static void main(String[] args) {
		// Create a method that will say Hello in different language
		//based on the country that will passed when method is executed.


	  Hello sayhello=new Hello ();
		sayhello.sayHello("Turkish");
		sayhello.sayHello("English");
		sayhello.sayHello("Dutch");
		sayhello.sayHello("Russian");
		
	}

}

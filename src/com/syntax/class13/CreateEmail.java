package com.syntax.class13;

public class CreateEmail {

void Email ( String name, String lastName, char at, String ending)	 {
	
	System.out.println(name+lastName+ at+ ending);
}
	
	
	
	public static void main(String[] args) {
// Create a method createEmail(). 
//Based on values of users name, lastName and email type, 
//your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 
	
		
		CreateEmail		firstOne = new CreateEmail ();
		
		firstOne.Email("john", "snow", '@', "gmail.com");
		firstOne.Email("tim", "low", '@', "gmail.com");

		
	}

}

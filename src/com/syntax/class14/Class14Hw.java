package com.syntax.class14;

import java.util.Scanner;

public class Class14Hw {
	
	
	void checkInfo ( String username, String password, String confirmpass) {
		
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("the username and/ or password cant be left empty");
		}
		else if (password.length()< 8) {
			System.out.println("the password is too short");
		}
		else if (password.toLowerCase().contains(username )) {
			System.out.println("the password cant contain username");	
		}
		else if (!password.equals(confirmpass)) {
			System.out.println("the password does not match witht the confirmed password");
		}
		else {
			System.out.println("You have successfully created your account");
		}
		
	}

	public static void main(String[] args) {

		Class14Hw checkpass= new Class14Hw ();
		checkpass.checkInfo ("cactus", "cactus123", "cactus12");
		checkpass.checkInfo ("desert", "cactus123", "cactus123");
		checkpass.checkInfo ("desert", "cactus1", "cactus1");
		checkpass.checkInfo ("", "cactus123", "cactus12");
		checkpass.checkInfo ("desert", "cactus123", "cactus12");
		

		
			
	}
}



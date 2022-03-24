package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		

		String userName="Lilly";
		String password="lily123";
		if("Lilly".equals(userName)&&"lily123".equals(password)) {
			System.out.println("welcome back");
		}else {
			System.out.println("credentials not correct");
		}
		
		
		if("Lilly".equalsIgnoreCase(userName)&&"lily123".equals(password)) {
			System.out.println("welcome back");
		}else {
			System.out.println("credentials not correct");
		}
	}

}

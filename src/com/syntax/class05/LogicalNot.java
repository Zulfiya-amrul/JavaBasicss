package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		// logical not is used to revert the condition 
		
		boolean value = !false;
		System.out.println(value);
		
		System.out.println("------------------");
		
		boolean traffic = false;
		
		if ( !traffic) {
			System.out.println("i will come on time to work");
		}
		String day = "saturday";
		
		if (!day.equals("saturday")) {
			System.out.println("today is not saturday");
		}
		boolean checkboxChecked= false;
		
		if (!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}
		
		String java = "hard";
		
		if (!java.equals("hard")) {
			
			System.out.println("you are genius");
		}
		
		
		
		
		System.out.println("------THE END OF CODE------");
		
		
		
		
	}

}

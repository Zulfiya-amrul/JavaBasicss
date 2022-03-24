package com.syntax.class13;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// student object 
		//Student myStudent= new Student ();// here we create the object student 
		//myStudent.firstName= "Jim";
		//myStudent.lastName= "Halper";
		//myStudent.major= "Business";
		//myStudent.age= 24;
		//myStudent.gpa = 2.9;
		//myStudent.onProbation= false;

		
		//System.out.println(myStudent.lastName);
	
		Student myStudentTwo= new Student ("ali",  "business",4.2);// here we create the object student 
		
		System.out.println(myStudentTwo.isOnHonorRoll ());
		
		Book book1 = new Book ("Harry Potter","JK Rowling", 500, "English");
	
		Book book2 = new Book ("The 4 hour workweek","Tim Ferriss", 300, "English");
		
	System.out.println(book1.title);
	System.out.println(book2.pages);
	
	String myName="mike";
	System.out.println("top");
	sayHi (myName, 47 ); 
	sayHi ("philis", 23); 
	//sayHi ("angela"); 
	System.out.println("buttom");
	
	
	}
	public static void sayHi (String name, int age) {
		System.out.println("Hello "+ name+ " you are "+ age );
		
	}

}

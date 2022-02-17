package com.syntax.class10;

public class ClassTask2 {

	public static void main(String[] args) {
		//Create a 2D array(shorter way)
		//in which first array will consist of 4 names and second array will contain grades.
		//Then your program should print name of the students that has A and B grade

		
		String [] [] namesGrades= {
				{"Ali", "Amy", "Anne", "Adam"}, // array 1 names- index 0 
				{"A", "B", "C", "D"} // array 2 grades- index 1 				
		};
		
		System.out.println(namesGrades[0][0] + " has a grade "+namesGrades[1][0] );
		
		System.out.println(namesGrades[0][1] + " has a grade "+namesGrades[1][1] );

		
	}

}

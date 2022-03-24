package com.syntax.replithw;

public class Main {
	
	

	 String breed;
	 String name;
	 String color;

	 void bark () {
	   System.out.println(name + " can bark");
	 }
	 void run () {
	   System.out.println(name + " can run");
	 }
	 void play () {
	   System.out.println(name + " can play");
	 }
	 
	 void printAll () {
		   System.out.println(name + " can bark");
		   System.out.println(name + " can run");
		   System.out.println(name + " can play");

	 }
	 
	 public static void main(String[] args) {
	 
	 
	 Main dogOne= new Main();
	 dogOne.name= "Husky";
	 dogOne.printAll(); 
	 
	 

	 Main dogTwo= new Main();
	 dogTwo.name= "Bulldog";
	dogTwo.printAll();
	
	Main dogThree= new Main ();
	dogThree.name= "Labrador";
	dogThree.printAll();
	
	

}
}

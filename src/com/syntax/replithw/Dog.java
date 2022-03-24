package com.syntax.replithw;

public class Dog {
	
		  String dogName;
		  double dogWeight;
		  static String dogBreed = "Mutt";
		  void printInfo () {
		    System.out.println (dogName + " " +  dogBreed + " " +dogWeight);
		  }
		  Dog (String dogName, double dogWeight) {
		   this.dogName= dogName;
		   this.dogWeight = dogWeight;
		}
		  
		
		  public static void main (String [] agrs) {
		    Dog obj1= new Dog ("Tarzan", 50.0);
		    obj1.printInfo ();
		    Dog obj2= new Dog ("Lucy", 10.0);
		    obj2.printInfo ();
		  }
		}



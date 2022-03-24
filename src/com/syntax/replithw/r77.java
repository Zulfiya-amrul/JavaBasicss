package com.syntax.replithw;

import java.util.Scanner;

public class r77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int size =5;
Scanner scan= new Scanner (System.in);

int [] array = new int [size];
for (int i=0; i<size; i ++) {
  System.out.println("enter value");
 array[i]= scan.nextInt(); 
}

for (int i =size-1; i>=0; i--) {
  System.out.println(array[i]);
}
	}

}

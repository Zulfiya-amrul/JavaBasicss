package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {

		// if you forgot the main method
		// main + ctr+ space enter ---> outocomplete

		int i = 10;
		double d = 10;// Here we had implicit casting/ widering/ automatic

		System.out.println(i);
		System.out.println(d); // this will give a value with decimal because you store in double
								// which is used for decimal values
								// casting happens automatically because its going from small number to big box
								// from intiger value to double.

		/*
		 * int num= 10.99; ERROR cant convert double into intiger value
		 */

		int num = (int) 10.99; // narrowing/ EXPLICIT CASTING happens here by putting --- int num=(int) 10.99;
		System.out.println(num); // the output will be 10, we lost the .99

		float f=10.99f; // must put f because if you dont java will recognize it as double, and you 
						// cant cast a double value inside float automatically/implicitly 
		
		byte b= (byte)1000; 
		
		System.out.println(b); // gives an upredictable number because this number is too big to be stored in a byte 
		
		
		
		
		
		
		
	}
}

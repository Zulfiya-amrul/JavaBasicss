package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create/ declare an array that holds 4 elements 
		int [] numbers= new int [4]; 
		// storing values/elements inside an array 
		numbers [0]= 90;
		numbers [1]= 87;
		numbers [2]= 89;
		numbers [3]= 99;
		
		// i want to print/ access 99 
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+ numbers[0]);

		
		// i want to create an array of countries 
		
		
		String [] countries= new String[5]; 
		
		countries [0]= "USA";
		countries [1]= "Canada";
		countries [2]= "Afganistan";
		countries [3]= "Moldova";
		countries [4]= "Morocco";
		
		for (String country: countries ) {
			System.out.println(country );
		}
		
		//countries [5]= "Turkey";

		System.out.println(countries[3]);
		
		
		String [] names= new String [5];
		names [1]= "Orsan";
		names [2]= "Gulnar";
		names [3]= "Zakirullah";
		
		
		
		System.out.println(names [0]);// null compiler will add default value of this data type 
		
		names[1]= "Daniyar";
		System.out.println(names[1]);
	
	// create an array to store different prices, ( 4)
		
		double [] prices= new double [4];
		
		prices [0]= 12.99; 
		prices [1]= 14.99; 
		prices [2]= 45.99; 
		prices [3]= 99.99; 
		
	double average= (( prices [0]+ prices [1]+prices [2]+prices [3]))/4;
	System.out.println(average);
	}

}

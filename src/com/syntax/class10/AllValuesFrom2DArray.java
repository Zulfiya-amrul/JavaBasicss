package com.syntax.class10;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] num= {{10, 20, 30 },// 0 
				{100, 200, 300, 400 }, // 1 
				{1000, 2000} // 2
		
		};
		// number.length - > gives # of rows 
		int size= num.length; // when used with 2D arrays gives # of 1D arrays that we stored 
		
		System.out.println(size);// size gives me 3 because we have 3 arrays 
	
		int sizeOf1Array= num [0].length;
		System.out.println(sizeOf1Array); //
		
		int sizeOf2Array= num [1].length;
		System.out.println(sizeOf2Array); //

		
		int sizeOf3Array= num [2].length;
		System.out.println(sizeOf3Array); //

		// Retrieving all elements from 2D array (we need 2 loops) 
		// outer loop will iterate over 1 d array 
		// inner will 
		
		
		for ( int i=0; i<num.length; i++  ) {
			
			
			for (int j=0; j<num[i].length; j++) {
				
				System.out.print( num [i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	
	
	}

}

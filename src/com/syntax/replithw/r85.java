package com.syntax.replithw;

public class r85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			 int sum=0; 
			for ( int i =0; i <a.length; i ++ ) {
	      for (int j=0; j<a.length; j++)

	      if ( i%2==0 && j%2==0) {
	         sum= sum + a [i][j];
	      }

	    }
		
		System.out.println(sum);
		
	}

}

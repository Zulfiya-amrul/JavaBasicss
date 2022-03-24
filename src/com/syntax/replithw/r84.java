package com.syntax.replithw;

public class r84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

		int variable=0;

	  for (int [ ]oneArray:a) {
	    for (int eachValue: oneArray) {

	      if (eachValue<0 && !(eachValue%2==0)) {
	        variable=variable+1;

	      }
	    }
	  }
		
		System.out.println(variable);
		
	}

}

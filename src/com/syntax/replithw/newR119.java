package com.syntax.replithw;


public class newR119 {
	
	String censorLetter (String a, char b) {
		
		return 
		a = a.replace(b, '*') ;
				
	
	
	//return a=a.replace ('a', '*');
			
			
			
	}
	public static void main(String[] args) {
		
		newR119 obj= new newR119 ();
		obj.censorLetter("computer science", '*');
		
		
	System.out.println(obj.censorLetter("computer science", 'e'));
	
	System.out.println(obj.censorLetter("trick or treat", 't'));
		
	}

}

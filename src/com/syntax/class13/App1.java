package com.syntax.class13;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Song holiday= new Song ("Holiday", "Green day", 200 );
	Song americanIdiot = new Song ("American Idiot", "Green day", 168);
	
	System.out.println(holiday.getTitle());
	System.out.println(americanIdiot.getTitle());

	System.out.println(holiday.getSongsCount ());
	System.out.println(americanIdiot.getSongsCount ());
	
	
	
	
	}

}

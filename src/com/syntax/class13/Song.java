package com.syntax.class13;

public class Song {
	private String title;
	private String artist;
	private int length;
	private static int songsCount=0;
	
	
	
	
	// constructor 
	public Song (String title, String artist, int length) {
		this.title = title; 
		this.artist = artist;
		this.length= length;
		songsCount ++;
		System.out.println("songs count:" + songsCount);
	}
	
	
	public int getSongsCount () {
		return songsCount;
		
	}
	//  getters and setters 
	public String getTitle () {
		return title;
		
	}
	// setters 
	public void setTitle ( String title) {
		this.title = title;
		
	}
	// getters 
	public String getArtist () {
		return artist;
		
	}
	
	
	
	
	
}

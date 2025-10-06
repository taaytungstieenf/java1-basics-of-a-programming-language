package com.example.chapter2Instance.part1BasicInstance;

public class Club {

	String clubname, location;
    String stadium, borough;
	
	public Club(String Clubname, String Location, String Stadium, String Borough) {

		this.clubname = Clubname;
		this.location = Location;

		this.stadium = Stadium;
		this.borough = Borough;
	}

	public static void main(String[] args) {

		Club spurs = new Club("Tottenham Hotspur", "North London", "White Hart Lane", "Haringey");
		Club irons = new Club("West Ham United", "East London", "London", "Newham");
		Club lions = new Club("Millwall", "South London", "The Den", "South Bermondsey");

		System.out.println(spurs.clubname);
		System.out.println(irons.clubname);
		System.out.println(lions.clubname);
	}
}
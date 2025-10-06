package com.example.chapter2Instance.part2PreIntermediateInstance;

public class Club {

	String clubname, location;
    String stadium, borough;
	
	public Club(String Clubname, String Location, String Stadium, String Borough) {

		this.clubname = Clubname;
		this.location = Location;

		this.stadium = Stadium;
		this.borough = Borough;
	}

	public void ClubIntroduction() {

		System.out.println("Clubname: " + clubname);
		System.out.println("Location: " + location);
		System.out.println("Stadium : " + stadium);
		System.out.println("Borough : " + borough);
	}

	public static void main (String[] args) {

		Club spurs = new Club("Tottenham Hotspur", "North London", "White Hart Lane", "Haringey");
		Club irons = new Club("West Ham United", "East London", "London", "Newham");
		Club lions = new Club("Millwall", "South London", "The Den", "South Bermondsey");

		spurs.ClubIntroduction();
		irons.ClubIntroduction();
		lions.ClubIntroduction();

		System.out.println(spurs);
		System.out.println(irons);
		System.out.println(lions);
	}
}
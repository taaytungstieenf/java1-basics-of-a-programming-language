package com.example.chapter2Instance.part1BasicInstance;

public class Club {

	String club_name;
	String location;
	String stadium;
	
	public Club(String name, String place, String ground) {

		this.club_name = name;
		this.location = place;
		this.stadium = ground;
	}

	public static void main(String[] args) {

		Club spurs = new Club("Tottenham Hotspur", "London", "White Hart Lane");
		Club city = new Club("Manchester City", "Manchester", "Etihad");

		System.out.println(spurs.stadium);
		System.out.println(city.stadium);
	}
}
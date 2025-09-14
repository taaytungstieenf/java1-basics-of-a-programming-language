package com.example.chapter2Instance.part3IntermediateInstance;

public class Club {

	String club_name;
	String location;
	String stadium;
	String nation;
	String league;

	int foundedYear;
	int currentYear;
	
	public Club(String name, String place, String ground, String country, String tier) {

		this.club_name = name;
		this.location = place;
		this.stadium = ground;
		this.nation = country;
		this.league = tier;
	}

	public int getAge(int founded, int current) {
    	return current - founded;
	}

	public void ClubIntroduction() {
		System.out.println(club_name + " football club is located in " + nation + ", playing in the " + league);
		System.out.println("This club is based in " + location + " and the stadium is called " + stadium);
	}

	public static void main(String[] args) {

		Club spurs = new Club("Tottenham Hotspur", "London", "White Hart Lane", "England", "English Premier League");

		spurs.ClubIntroduction();

		int spursBirthyear = spurs.getAge(1882, 2025);

		System.out.println("Age of Spurs: " + spursBirthyear);
	}
}
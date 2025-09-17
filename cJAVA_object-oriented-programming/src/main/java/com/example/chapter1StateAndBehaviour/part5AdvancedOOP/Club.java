package com.example.chapter1StateAndBehaviour.part5AdvancedOOP;

public class Club {

	String nation = "England";
	String league = "English Premier League";

	String club_name;
	String location;
	String stadium;

	public void Spurs() {
		this.club_name = "Tottenham Hotspur";
		this.location = "London";
		this.stadium = "White Hart Lane";
	}

	public void City() {
		this.club_name = "Manchester City";
		this.location = "Manchester";
		this.stadium = "Etihad";
	}

	public void Toffees() {
		this.club_name = "Everton";
		this.location = "Liverpool";
		this.stadium = "Hill Dickinson";
	}    

	public void ClubIntroduction() {
		System.out.println(club_name + " football club is located in " + nation + ", playing in the " + league);
		System.out.println("This club is based in " + location + " and the stadium is called " + stadium);
	}

	public static void main(String[] args) {
		Club c = new Club();

		c.Spurs();
		c.ClubIntroduction();
	}
}
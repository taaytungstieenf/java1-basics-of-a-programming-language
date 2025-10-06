package com.example.chapter2Instance.part3IntermediateInstance;

public class Club {

	String clubname, location;
    String stadium, borough;

    int foundedYear;
    int currentYear;
	
	public Club(String Clubname, String Location, String Stadium, String Borough, int FoundedYear, int CurrentYear) {

		this.clubname = Clubname;
		this.location = Location;

		this.stadium = Stadium;
		this.borough = Borough;

		this.foundedYear = FoundedYear;
		this.currentYear = CurrentYear;
	}

	public void ClubIntroduction() {

		System.out.println("Clubname: " + clubname);
		System.out.println("Location: " + location);
		System.out.println("Stadium : " + stadium);
		System.out.println("Borough : " + borough);
	}

	public int getAge(int founded, int current) {

    	return current - founded;
	}

	public static void main(String[] args) {

	    Club spurs = new Club("Tottenham Hotspur", "North London", "White Hart Lane", "Haringey", 1882, 2025);
	    Club irons = new Club("West Ham United", "East London", "London Stadium", "Newham", 1895, 2025);
	    Club lions = new Club("Millwall", "South London", "The Den", "South Bermondsey", 1885, 2025);

	    spurs.ClubIntroduction();
	    System.out.println("Age: " + spurs.getAge(spurs.foundedYear, spurs.currentYear) + " years\n");

	    irons.ClubIntroduction();
	    System.out.println("Age: " + irons.getAge(irons.foundedYear, irons.currentYear) + " years\n");

	    lions.ClubIntroduction();
	    System.out.println("Age: " + lions.getAge(lions.foundedYear, lions.currentYear) + " years\n");
	}

}
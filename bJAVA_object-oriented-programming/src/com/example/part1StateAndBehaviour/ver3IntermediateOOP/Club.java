package com.example.part1StateAndBehaviour.ver3IntermediateOOP;

public class Club {
	
	String club_name;
	String location;
	String stadium;

	public void set_value() {
		club_name = "Tottenham Hotspur";
		location = "London, England";
		stadium = "White Hart Lane";
	}

	public void get_value() {
		System.out.println("Club name: " + club_name);
		System.out.println("Location: " + location);
		System.out.println("Stadium: " + stadium);
	}

	public static void main(String [] args) {

		Club c = new Club();
		
		c.set_value();
		c.get_value();
	}
}
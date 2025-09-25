package com.example.chapter1StateAndBehaviour.part3IntermediateOOP;

public class Club {
	
    String clubname, location;
    String stadium, borough;
    String street, postal;
    String manager, captain;
    String bestPlayer, bestTrophy;

	public void set_value() {

		clubname = "Tottenham Hotspur";
		location = "North London, England";

		stadium = "White Hart Lane";
		borough = "Haringey";

		street = "N17";
		postal = "N17 OBX";

		manager = "Thomas Frank";
		captain = "Cristian Romero";

		bestPlayer = "Harry Kane";
		bestTrophy = "UEFA Europa League 2025";
	}

	public void get_value() {
		
		System.out.println("Club name: " + clubname);
        System.out.println("Location: " + location);

        System.out.println("Stadium: " + stadium);
        System.out.println("Borough: " + borough);

        System.out.println("Street: " + street);
        System.out.println("postal: " + postal);

        System.out.println("Current manager: " + manager);
        System.out.println("Current captain: " + captain);

        System.out.println("Current best player: " + bestPlayer);
        System.out.println("Current best trophy: " + bestTrophy);
	}

	public static void main(String [] args) {

		Club c = new Club();
		
		c.set_value();
		c.get_value();
	}
}
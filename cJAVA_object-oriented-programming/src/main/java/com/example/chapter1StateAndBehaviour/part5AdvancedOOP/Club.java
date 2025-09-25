package com.example.chapter1StateAndBehaviour.part5AdvancedOOP;

public class Club {

	String nation = "England";

	String clubname, location;
    String stadium, borough;
    String street, postal;
    String manager, captain;
    String bestPlayer, bestTrophy;

    public void Spurs() {

        clubname = "Tottenham Hotspur";
        location = "North London, England";

        stadium = "White Hart Lane";
        borough = "Haringey";

        street = "N17";
        postal = "N17 OBX";

        manager = "Thomas Frank";
        captain = "Cristian Romero";

        bestPlayer = "Harry Kane";
        bestTrophy = "Uefa Europa League";
    }

    public void Irons() {

        clubname = "West Ham United";
        location = "East London, England";

        stadium = "London Stadium";
        borough = "Newham";

        street = "E20";
        postal = "E20 2ST";

        manager = "Graham Potter";
        captain = "Jarrod Bowen"; 

        bestPlayer = "Mark Noble";
        bestTrophy = "UEFA Europa Conference League 2023";
    }

    public void Lions() {

        clubname = "Millwall";
        location = "South London, England";

        stadium = "The Den";
        borough = "South Bermondsey";

        street = "SE16";
        postal = "SE16 3LN";

        manager = "Joe Edwards";
        captain = "Jake Cooper";

        bestPlayer = "Zian Flemming";
        bestTrophy = "FA Cup Runner-up 2004";
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

	public static void main(String[] args) {

		Club c = new Club();

		c.Spurs();
		c.get_value();

		c.Irons();
		c.get_value();
	}
}
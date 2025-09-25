package com.example.chapter1StateAndBehaviour.part1BasicOOP;

public class Club {

    String clubname = "Tottenham Hotspur";
    String location = "North London, England";

    String stadium = "White Hart Lane";
    String borough = "Haringey";

    String street = "N17";
    String postal = "N17 OBX";

    String manager = "Thomas Frank";
    String captain = "Cristian Romero";

    String bestPlayer = "Harry Kane";
    String bestTrophy = "Uefa Europa League";

    public static void main(String[] args) {

        Club c = new Club();

        System.out.println("Club name: " + c.clubname);
        System.out.println("Location: " + c.location);

        System.out.println("Stadium: " + c.stadium);
        System.out.println("Borough: " + c.borough);

        System.out.println("Street: " + c.street);
        System.out.println("Postal: " + c.postal);

        System.out.println("Current manager: " + c.manager);
        System.out.println("Current captain: " + c.captain);

        System.out.println("Current best player: " + c.bestPlayer);
        System.out.println("Current best trophy: " + c.bestTrophy);
    }
}
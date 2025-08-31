package com.example.part1StateAndBehaviour.ver1BasicOOP;

public class Club {

    String club_name = "Tottenham Hotspur";
    String location = "London, England";
    String stadium = "White Hart Lane";

    public static void main(String[] args) {

        Club c = new Club();

        System.out.println("Club name: " + c.club_name);
        System.out.println("Location: " + c.location);
        System.out.println("Stadium: " + c.stadium);
    }
}

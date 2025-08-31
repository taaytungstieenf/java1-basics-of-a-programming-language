package com.example.part1StateAndBehaviour.ver2PreIntermediateOOP;

/**
public class Club {

    String club_name;
    String location;
    String stadium;

    public static void main(String[] args) {

        Club c = new Club();

        c.club_name = "Tottenham Hotspur";
        c.location = "London, England";
        c.stadium = "White Hart Lane";

        System.out.println("Club name: " + c.club_name);
        System.out.println("Location: " + c.location);
        System.out.println("stadium: " + c.stadium);
    }
}
**/

public class Club {

    String club_name = "none";
    String location = "none";
    String stadium = "none";

    public static void main(String[] args) {

        Club c = new Club();

        c.club_name = "Tottenham Hotspur";
        c.location = "London, England";
        c.stadium = "White Hart Lane";

        System.out.println("Club name: " + c.club_name);
        System.out.println("Location: " + c.location);
        System.out.println("stadium: " + c.stadium);
    }
}
package com.example.chapter1StateAndBehaviour.part4UpperIntermediateOOP;

public class Club {

    String club_name, location, stadium;

    public void spurs() {
        club_name = "Tottenham Hotspur";
        location = "North London, England";
        stadium = "White Hart Lane";
    }

    public void qpr() {
        club_name = "Queens Park Rangers";
        location = "West London, England";
        stadium = "Loftus Road";
    }

    public void hammers() {
        club_name = "West Ham United";
        location = "East London, England";
        stadium = "London Stadium";
    }

    public void get_value() {
        System.out.println("Club name: " + club_name);
        System.out.println("Location: " + location);
        System.out.println("Stadium: " + stadium);
        System.out.println();
    }

    public static void main(String[] args) {
        Club s = new Club();
        s.spurs();
        s.get_value();

        Club q = new Club();
        q.qpr();
        q.get_value();

        Club h = new Club();
        h.hammers();
        h.get_value();
    }
}
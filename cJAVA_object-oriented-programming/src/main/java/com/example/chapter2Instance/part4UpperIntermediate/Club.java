package com.example.chapter2Instance.part4UpperIntermediateInstance;

import java.util.Scanner;

public class Club {

    String club_name;
    String location;
    String stadium;
    String nation;
    String league;

    public Club(String name, String place, String ground, String country, String tier) {
        this.club_name = name;
        this.location = place;
        this.stadium = ground;
        this.nation = country;
        this.league = tier;
    }

    public int getAge(int current, int founded) {
        return current - founded;
    }

    public void ClubIntroduction() {
        System.out.println(club_name + " football club is located in " + nation + ", playing in the " + league);
        System.out.println("This club is based in " + location + " and the stadium is called " + stadium);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();
        System.out.print("Enter founded year: ");
        int foundedYear = sc.nextInt();

        Club spurs = new Club("Tottenham Hotspur", "London", "White Hart Lane", "England", "English Premier League");
        spurs.ClubIntroduction();

        int spursAge = spurs.getAge(currentYear, foundedYear);


        System.out.println("Age of Spurs: " + spursAge);

        sc.close();
    }
}
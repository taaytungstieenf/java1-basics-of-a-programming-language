package com.example.part1StateAndBehaviour.v0Minimal;

public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Tae Ngyee";
        p.age = 26;

        System.out.println("Name is " + p.name);
        System.out.println("Age is " + p.age);
    }
}

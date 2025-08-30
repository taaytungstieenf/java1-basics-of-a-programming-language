package com.example.part1StateAndBehaviour.ver1BasicOOP;

public class BasicOOP {
    String name = "Tae Ngyee";
    int year = 1882;

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name is " + p.name);
        System.out.println("Age is " + p.age);
    }
}

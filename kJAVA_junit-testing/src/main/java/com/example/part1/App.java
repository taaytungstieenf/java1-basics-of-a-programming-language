package com.example.part1;

public class App {
    public String greet() {
        return "Hello from Part1!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet());
    }
}

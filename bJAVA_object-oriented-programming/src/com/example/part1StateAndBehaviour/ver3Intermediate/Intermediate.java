package com.example.part1StateAndBehaviour.v1StateAndBehaviour;

public class Person {
	
	String name;
	int age;

	public void set_value() {
		age = 26;
		name = "Tae Ngyee";
	}

	public void get_value() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}

	public static void main(String [] args) {
		Person p = new Person();
		
		p.set_value();
		p.get_value();
	}
}
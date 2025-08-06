package com.example.p2Instance.v1Instance;

public class Person {

	int age;
	String name;
	
	// constructor must be the same name with class
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Person Tay = new Person(26, "tae");
		Person Lam = new Person(20, "lam");

		System.out.println(Tay.age);
		System.out.println(Lam.age);
	}
}
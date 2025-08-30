package com.example.p2Instance.v2Instance;

public class Person {

	String name, faculty, major;
	int birthYear;

	public Person(String name, String faculty, String major, int birthYear) {
		this.name = name;
		this.faculty = faculty;
		this.major = major;
		this.birthYear = birthYear;
	}

	public void displayInformation() {
		System.out.println("Name: " + name + "; birth year: " + birthYear);
		System.out.println("Faculty: " + faculty + "; major: " + major);
	}

	public static void main (String[] args) {
		Person tae = new Person("Tay Nguyen", "IT", "DE", 1999);
		Person heo = new Person("Lam Nguyen", "Electric", "Electrical Technology", 2005);

		tae.displayInformation();
		heo.displayInformation();

		System.out.println(tae);
		System.out.println(tae);
	}
}
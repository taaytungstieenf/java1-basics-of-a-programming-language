package com.example.p1Variables.v2Variables;

import java.util.Scanner;

public class Person {

	String name = "Tay Nguyen";
	boolean isMarried = false;

	final char sex;
	final int birthYear;

	final String uni;
	final String major;
	final float gpa;

	public Person() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		this.name = sc.nextLine();
		System.out.print("Are you married: ");
		this.isMarried = sc.nextBoolean();

		System.out.print("Male or Female: ");
		this.sex = sc.next().charAt(0);
		System.out.print("Birth year: ");
		this.birthYear = sc.nextInt();
		sc.nextLine(); // clear cache

		System.out.print("University: ");
		this.uni = sc.nextLine();
		System.out.print("Your major: ");
		this.major = sc.nextLine();
		System.out.print("Your GPA on the scale of 10: ");
		this.gpa = sc.nextFloat();
	}

	public void display() {

		System.out.println(name + " " + isMarried);
		System.out.println(birthYear + " " + sex);
		System.out.println(uni + " " + major + " " + gpa);
	}

	public static void main(String[] args) {
		Person p = new Person();

		p.display();
	}
}
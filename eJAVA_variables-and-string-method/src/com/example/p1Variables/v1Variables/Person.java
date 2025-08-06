package com.example.p1Variables.v1Variables;

public class Person {

	String name;
	boolean isMarried;

	final int birthYear;
	final char sex; //m: male; f: female
	
	final String uni = "HCMC University of Technology and Education";
	final String major = "Data Engineering";
	final float gpa = 7.0f; // scale of 10

	public Person(String name, boolean isMarried, int birthYear, char sex) {
		this.name = name;
		this.isMarried = isMarried;
		this.birthYear = birthYear;
		this.sex = sex;
	}

	public static void main(String[] args) {
		Person v = new Person("Tay Nguyen", false, 1999, 'm');

		System.out.println("- Information:");
		System.out.println(v.name + " " + v.isMarried);

		System.out.println("- Initialize final variable inside constructor:");
		System.out.println(v.birthYear + " " + v.sex);

		System.out.println("- Initialize final variable before creating constructor object:");
		System.out.println(v.uni + " " + v.major + " " + v.gpa);
	}
}
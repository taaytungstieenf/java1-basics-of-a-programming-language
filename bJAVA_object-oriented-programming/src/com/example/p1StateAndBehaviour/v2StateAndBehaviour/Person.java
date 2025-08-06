package com.example.p1StateAndBehaviour.v2StateAndBehaviour;

public class Person {

	String name, dob, uni;

	public void Tay_Nguyen() {
		name = "Nguyen Duc Tay";
		dob = "1/2/1999";
		uni = "University of Technology and Education";
	}

	public void Lam_Nguyen() {
		name = "Nguyen Van Duc Lam";
		dob = "12/9/2005";
		uni = "Industrial University of HCMC";
	}

	public void get_value() {
		System.out.println("Name is " + name);
		System.out.println("Day of birth is " + dob);
		System.out.println("University is " + uni);
	}

	public static void main(String[] args) {
		Person p = new Person();

		p.Lam_Nguyen();
		p.get_value();
	}
}
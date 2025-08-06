package com.example.p2Instance.v3Instance;

public class Person {

	String name;
	int birthYear;
	float height, weight;

	public Person (String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public float BMI(float heightCM, float weightKG) {
    	return weightKG / (heightCM * heightCM);
	}

	public void displayInformation() {
		System.out.println("The patient: " + name);
		System.out.println("Birth year: " + birthYear);
	}

	public static void main(String[] args) {
		Person tae = new Person("Tay Nguyen", 1999);

		tae.displayInformation();

		float taeBMI = tae.BMI(168, 74);

		System.out.println("Patient Tay Nguyen's BMI: " + taeBMI);
	}
}
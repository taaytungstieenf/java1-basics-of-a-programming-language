package com.example.p2Instance.ver3IntermediateInstance;

import java.util.Scanner;

public class Person {

    String name;
    int birthYear;
    float height, weight;

    public Person(String name, int birthYear) {
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
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu từ console
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();

        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter height (cm): ");
        float height = scanner.nextFloat();

        System.out.print("Enter weight (kg): ");
        float weight = scanner.nextFloat();

        // Tạo instance với dữ liệu nhập
        Person patient = new Person(name, birthYear);

        // Hiển thị thông tin
        patient.displayInformation();

        // Tính BMI
        float bmi = patient.BMI(height, weight);
        System.out.println("BMI: " + bmi);

        scanner.close();
    }
}

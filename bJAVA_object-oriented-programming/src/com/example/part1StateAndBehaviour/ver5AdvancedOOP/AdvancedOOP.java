package com.example.p1StateAndBehaviour.v3StateAndBehaviour;

public class Person {

	String name = "Nguyen Duc Tay";
	String sex = "male";
	int birthYear  = 1999;
	String birthPlace = "Saigon";
	String nationality = "Vietnamese";

	String school;
	String district;
	int joinYear;

	public void primarySchool() {
		this.school = "Binh Hoa";
		this.district = "Binh Thanh";
		this.joinYear = 2005;
	}

	public void secondarySchool() {
		this.school = "Ba Diem 2";
		this.district = "12";
		this.joinYear = 2010;
	}

	public void highSchool() {
		this.school = "Nguyen Chi Thanh";
		this.district = "Tan Binh";
		this.joinYear = 2014;
	}

	public void university() {
		this.school = "University of Technology and Education";
		this.district = "Thu Duc";
		this.joinYear = 2017;
	}

	public void admission() {
		System.out.println("Hoc sinh " + name + " sinh nam " + birthYear + " gioi tinh " + sex);
		System.out.println("Noi sinh " + birthPlace + " quoc tich " + nationality);

		System.out.println("Nam " + joinYear + " nhap hoc truong " + school + " o quan " + district);
	}

	public static void main(String[] args) {
		Person p = new Person();

		p.highSchool();

		p.admission();

	}
}
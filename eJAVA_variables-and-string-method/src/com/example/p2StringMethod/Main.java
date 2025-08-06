package com.example.p2StringMethod;

public class Main {

	public static void main(String[] args) {
		String str = "Nguyen Duc Tay";

		System.out.println("Length of string: " + str.length());
		System.out.println("Index of `y`: " + str.indexOf("y"));
		System.out.println("Index of `z`: " + str.indexOf("z"));
		System.out.println("Index of `z`: " + str.indexOf("z"));

		String str1 = "Tay ";
		String str2 = "Nguyen";

		System.out.println("Concatenate str1 & str2: " + str1.concat(str2));
		System.out.println("str1 equals to `Tay`: " + str1.equals("Tay"));
		System.out.println("str2 equals to `nguyen`: " + str2.equalsIgnoreCase("nguyen"));

		System.out.println("Print the character at 5 in str: " + str.charAt(5));
		System.out.println("Print the character at 7 in str: " + str.charAt(7));

		System.out.println("Print the uppercase version of str: " + str.toUpperCase());
		System.out.println("Print the uppercase version of str: " + str.toLowerCase());
	}
}
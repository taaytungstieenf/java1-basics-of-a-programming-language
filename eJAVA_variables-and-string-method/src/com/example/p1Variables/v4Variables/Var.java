package com.example.p1Variables.v4Variables;

public class Var {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		int c, d, e, f, g;

		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

		int h = 5;

		System.out.println(h+=3);
		System.out.println(h-=4);
		System.out.println(h*=6);
		System.out.println(h/=2);
		System.out.println(h%=7);
	}
}
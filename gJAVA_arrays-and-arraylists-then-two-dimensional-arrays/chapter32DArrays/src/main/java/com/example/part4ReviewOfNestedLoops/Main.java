package com.example.part4ReviewOfNestedLoops;

public class Main {
	public static void main(String[] args) {
		int tableSize = 10;
    for(int i = 1; i <= 10; i++){
      for(int j = 1; j <= 10; j++){
        System.out.print(i * j);
        System.out.print(" ");
      }
      System.out.println();
    }
	}
}
package com.example.chapter3InheritanceAndPolymorphism.part5UsingAChildClassAsItsParentClass;

public class Main{
  public static void main(String[] args) {
    Dinner noodlesDinner = new Dinner();
    Noodle biangBiang = new BiangBiang();

    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
  }
}
package com.example.part3InheritanceAndPolymorphism.ver5UsingAChildClassAsItsParentClass;

import com.example.part3InheritanceAndPolymorphism.ver5UsingAChildClassAsItsParentClass.Dinner;

public class Main{
  public static void main(String[] args) {
    Dinner noodlesDinner = new Dinner();
    Noodle biangBiang = new BiangBiang();

    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
  }
}
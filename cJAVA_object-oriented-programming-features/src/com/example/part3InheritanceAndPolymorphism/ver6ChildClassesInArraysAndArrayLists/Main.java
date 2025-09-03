package com.example.part3InheritanceAndPolymorphism.ver6ChildClassesInArraysAndArrayLists;

import com.example.part3InheritanceAndPolymorphism.ver6ChildClassesInArraysAndArrayLists.Noodle;
import com.example.part3InheritanceAndPolymorphism.ver6ChildClassesInArraysAndArrayLists.Pho;
import com.example.part3InheritanceAndPolymorphism.ver6ChildClassesInArraysAndArrayLists.Ramen;
import com.example.part3InheritanceAndPolymorphism.ver6ChildClassesInArraysAndArrayLists.Spaghetti;

public class Main {
  public static void main(String[] args) {
    Noodle spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
        
    Noodle[] allTheNoodles = {spaghetti, ramen, pho};
    for(Noodle noodle: allTheNoodles){
      System.out.println(noodle.getCookPrep());
    }   
  }
}
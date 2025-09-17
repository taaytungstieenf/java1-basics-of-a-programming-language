package com.example.chapter3InheritanceAndPolymorphism.part6ChildClassesInArraysAndArrayLists;

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
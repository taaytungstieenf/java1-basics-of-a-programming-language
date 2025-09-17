package com.example.chapter3InheritanceAndPolymorphism.part7ChildClassesInMethodParameters;

public class Main{
  public static void main(String[] args) {
    Noodle ramen, pho;
    ramen = new Ramen();
    pho = new Pho();
      
    NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
  
    customer1.order(pho);
  
  }
}
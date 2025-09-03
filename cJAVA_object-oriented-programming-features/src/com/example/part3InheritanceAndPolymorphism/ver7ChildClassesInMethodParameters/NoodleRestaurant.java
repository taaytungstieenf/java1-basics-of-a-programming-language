package com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters;

class NoodleRestaurant {
  String name;

  public NoodleRestaurant(String customerName){
    name = customerName;
  }

  public void order(Noodle noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }
}
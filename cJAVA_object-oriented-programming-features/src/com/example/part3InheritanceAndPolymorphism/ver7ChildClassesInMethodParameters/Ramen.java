package com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters;

class Ramen extends Noodle {

  Ramen() {
    super(30.0, 0.3, "flat", "wheat flour");
  }
  
  @Override
  public String getCookPrep() { 
    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
  }
}
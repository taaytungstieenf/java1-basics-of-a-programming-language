package com.example.chapter3InheritanceAndPolymorphism.part2InheritingTheConstructor;

class Noodle {
  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";
    
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
      
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
      
  }
    
  public void cook() {
    this.texture = "cooked";
  }
    
}
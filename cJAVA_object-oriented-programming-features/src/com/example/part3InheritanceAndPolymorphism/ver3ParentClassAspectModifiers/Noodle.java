package com.example.part3InheritanceAndPolymorphism.ver3ParentClassAspectModifiers;

public class Noodle {
  private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public final boolean isTasty() {
    return true;
  }

}
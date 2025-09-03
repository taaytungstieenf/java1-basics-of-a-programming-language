package com.example.part3InheritanceAndPolymorphism.ver3ParentClassAspectModifiers;

import com.example.part3InheritanceAndPolymorphism.ver3ParentClassAspectModifiers.Noodle;
import com.example.part3InheritanceAndPolymorphism.ver3ParentClassAspectModifiers.Ramen;

public class Main{
  public static void main(String[] args) {
    Ramen yasaiRamen = new Ramen();
    //System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());  
  }
}
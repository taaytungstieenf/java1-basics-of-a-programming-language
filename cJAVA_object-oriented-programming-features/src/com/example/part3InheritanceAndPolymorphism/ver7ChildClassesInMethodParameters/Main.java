package com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters;

import com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters.Noodle;
import com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters.Pho;
import com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters.Ramen;
import com.example.part3InheritanceAndPolymorphism.ver7ChildClassesInMethodParameters.NoodleRestaurant;

public class Main{
  public static void main(String[] args) {
    Noodle ramen, pho;
    ramen = new Ramen();
    pho = new Pho();
      
    NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
  
    customer1.order(pho);
  
  }
}
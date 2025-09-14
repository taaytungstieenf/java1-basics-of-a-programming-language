package com.example.part4ExceptionHandling;

/*
public class Main{
  
  public static void main(String[] args) {
   
   int width = 0;
   int length = 40;
   int ratio = length / width;
 
 }

}
*/

public class Main{
  public static void main(String[] args) {
   
   int width = 0;
   int length = 40;
   
   try {
     int ratio = length / width;
   } catch (ArithmeticException e) {
     System.err.println("ArithmeticException: " + e.getMessage());
   }
 }
}
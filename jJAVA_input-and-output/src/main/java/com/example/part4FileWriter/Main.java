package com.example.part4FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    FileWriter writer = new FileWriter("output.txt");
    String outputText = "We love learning to code with Codecademy.";
    writer.write(outputText);
    writer.close();
  }
}
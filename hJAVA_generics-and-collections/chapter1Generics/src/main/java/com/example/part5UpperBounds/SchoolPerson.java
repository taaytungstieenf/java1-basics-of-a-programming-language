package com.example.part5UpperBounds;

public class SchoolPerson {
  private String name;

  public SchoolPerson(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return "SchoolPerson (name = "+ this.name + ")";
  }
}
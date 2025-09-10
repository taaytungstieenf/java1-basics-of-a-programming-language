package com.example.part5UpperBounds;

public class Bus<T extends SchoolPerson> {
  private T rider;

  public Bus(T rider) {
    this.rider = rider;
  }

  public void setRider(T rider) {
    this.rider = rider;
  }

  public T getRider() {
    return this.rider;
  }

  public void printRider() {
    System.out.println(rider.toString());
  }
}
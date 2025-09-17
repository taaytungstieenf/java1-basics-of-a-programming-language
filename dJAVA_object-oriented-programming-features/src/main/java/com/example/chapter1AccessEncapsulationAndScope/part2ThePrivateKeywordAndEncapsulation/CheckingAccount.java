package com.example.chapter1AccessEncapsulationAndScope.part2ThePrivateKeywordAndEncapsulation;

public class CheckingAccount{
  private String name;
  private int balance;
  
  public CheckingAccount(String inputName, int inputBalance){
    name = inputName;
    balance = inputBalance;
  }
  
  private void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  public void printBalance(){
    System.out.println("Account balance is " + balance);
  }
  
  private void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }
}
package com.example.part1AccessEncapsulationAndScope.ver1ScopeAndPublicKeyword;

public class CheckingAccount{
  
  /*
  private String id, name;
  private int balance;
  */

  public String id, name;
  public int balance;
  
  public CheckingAccount(String inputId, String inputName, int inputBalance){
    
    id = inputId;
    name = inputName;
    balance = inputBalance;

  }
  
  public void addFunds(int fundsToAdd){

    balance += fundsToAdd;

  }
  
  public void printBalance(){

    System.out.println("Your balance is " + balance);

  }

  public void getInfo(){

    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    
  }
  
}
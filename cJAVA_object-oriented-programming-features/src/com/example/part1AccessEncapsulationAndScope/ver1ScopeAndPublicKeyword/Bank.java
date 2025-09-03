package com.example.part1AccessEncapsulationAndScope.ver1ScopeAndPublicKeyword;

import com.example.part1AccessEncapsulationAndScope.ver0Codecademy.CheckingAccount;

public class Bank{

  public static void main(String[] args){

    CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
    CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");

    CheckingAccount myBalance = new CheckingAccount("Tae", 500, "5");
    myBalance.printBalance();

    System.out.println(accountOne.name);

    accountOne.addFunds(5);
    accountOne.getInfo();
    
  }

}
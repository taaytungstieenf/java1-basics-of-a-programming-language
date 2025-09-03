package com.example.part1AccessEncapsulationAndScope.ver1AccessAndScope;

import com.example.part1AccessEncapsulationAndScope.ver1AccessAndScope.CheckingAccount;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100);
    accountTwo = new CheckingAccount("Hades", 200);
  }

  public static void main(String[] args){
    Bank bank = new Bank();

    System.out.println(bank.accountOne.name);
    System.out.println(bank.accountOne.balance);
  }
  
}

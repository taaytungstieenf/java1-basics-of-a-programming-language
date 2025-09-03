package com.example.part1AccessEncapsulationAndScope.ver8OtherPrivateMethods;

import com.example.part1AccessEncapsulationAndScope.ver8OtherPrivateMethods.CheckingAccount;

public class Bank{ 
  public static void main(String[] args){
    CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
    accountOne.getAccountInformation();
  }
}
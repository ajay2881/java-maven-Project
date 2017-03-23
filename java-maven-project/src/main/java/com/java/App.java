package com.java;

public class App{

  private double balance;
  private double unusedvariable;

  public App(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}
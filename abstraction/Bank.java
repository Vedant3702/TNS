package com.concetps.abstraction;

public interface Bank {
    double Min_Bal = 1000;
    double Deposit_Limit = 50000;

    void deposit(Account account,double amount);
    void withdraw(Account account, double amount);
}
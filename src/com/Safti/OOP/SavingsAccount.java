package com.Safti.chap7;

public class SavingsAccount extends CheckingAccount {
    private final double ineterestRate;

    public SavingsAccount(String accountNumber, int initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.ineterestRate = interestRate;
    }
}


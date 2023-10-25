package com.Safti.OOP;

public class SavingsAccount extends CheckingAccount {
    private final double interestRate;
    private static final int MAX_WITHDRAWAL=5;
    private int withdrawalCount;

    public SavingsAccount(String accountNumber, int initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    public double calculateInterest()
    {
        return getBalance()* interestRate /100;
    }
    @Override
    public void withdraw(int amount)
    {
        if(withdrawalCount ==MAX_WITHDRAWAL)
        {
            System.out.println("Withdrawal limit exceeded");
        }
        else {
            super.withdraw(amount);
            withdrawalCount++;
        }
    }
}


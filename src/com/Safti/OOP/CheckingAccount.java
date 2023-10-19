package com.Safti.OOP;

public class CheckingAccount {
    private final String accountNumber;
    private int balance;

    public CheckingAccount(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(int amount)
    {
        this.balance+=amount;
        System.out.println("Depositing Amount"+amount+"into account"+accountNumber);
        System.out.println("New balance"+balance);
    }
    public void withdraw(int amount)
    {
        this.balance-=amount;
        System.out.println("Withdrawing :"+amount);
        if(balance<0)
        {
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("New balance:"+balance);
        }

    }
    public int getBalance()
    {
        return this.balance;
    }

}

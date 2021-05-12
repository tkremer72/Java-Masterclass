package com.webtek.java.master_class;

import java.util.ArrayList;

public class Account {
    //Create fields
    private String accountName;
    private int balance;
    private ArrayList<Integer> transactions;
    //Create constructor and initialize accountName and transactions
    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }
    //Create a getter for getting the balance
    public int getBalance() {
        return balance;
    }

    //Create a method for deposits
    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited.  Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    //Create a method for withdrawal
    public void withdraw(int amount) {
        int withdrawal = -amount;
        if(withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn.  Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    //Create a method to get the balance
    public void calculateBalance() {
        this.balance = 0;
        for(int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }

}

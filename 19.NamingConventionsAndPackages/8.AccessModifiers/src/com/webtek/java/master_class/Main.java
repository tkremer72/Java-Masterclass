package com.webtek.java.master_class;

public class Main {

    public static void main(String[] args) {
        Account thomasAccount = new Account("Thomas");

        thomasAccount.deposit(1000);
        thomasAccount.withdraw(500);
        thomasAccount.withdraw(-200);
        thomasAccount.deposit(-20);
        thomasAccount.calculateBalance();
        //thomasAccount.balance = 5000;//we don't want to be able to do this

        System.out.println("Balance on account is " + thomasAccount.getBalance());
        //thomasAccount.transactions.add(4500);//also don't want to be able to do this either
        thomasAccount.calculateBalance();
    }
}

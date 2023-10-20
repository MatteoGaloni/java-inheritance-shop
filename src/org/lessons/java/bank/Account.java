package org.lessons.java.bank;

import java.util.Random;

public class Account {

    private int accountNumber;
    private String accountOwner;
    private double balance;

    public Account(String accountOwner) {
        Random randomGenerator = new Random();
        accountNumber = randomGenerator.nextInt(1,1001);
        this.balance = 0;
        this.accountOwner = accountOwner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }


    public String getAccountInfo() {
        String accountNumbertoString = Integer.toString(getAccountNumber());
        String balancetoString = Double.toString(getBalance());

        return "Account Number: " + accountNumbertoString + "\nAccount Owner: " + accountOwner + "\nBalance: " + balancetoString + "€";

    }
    //*****************
    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

//    ********************
    public void depositAmount(double amount){
        this.balance += amount;
    }
    public void withdrawAmount(double amount){
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + "€" + " successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }


}

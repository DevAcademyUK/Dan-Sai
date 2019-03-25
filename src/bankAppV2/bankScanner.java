package bankAppV2;

import java.util.Scanner;

public class bankScanner {

    private double balance;

    // Set Balance
    public bankScanner() {
        balance = 0.0;

    }

    //Deposit

    public void deposit(double amount) {
        balance = balance + amount;

    }

    //Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.err.println("Transaction failed due to insufficient funds");
        }
    }

    //Balance
    public double getBalance() {
        return balance;

    }
}

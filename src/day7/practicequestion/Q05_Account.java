package day7.practicequestion;

/*
Write a Java program to create an Account class with a constructor, a deposit() method to update the balance, and getter methods to display the account holder’s name and balance.
*/

class Account {
    private String name;
    private int balance;

    // Constructor
    public Account(String name) {
        this.name = name;
        this.balance = 0; // default balance
    }

    // Deposit method (updates balance)
    public void deposit(int amount) {
        balance += amount;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}

public class Q05_Account {
    public static void main(String[] args) {
        // Create account with constructor
        Account a = new Account("Dilakshan");

        // Deposit money
        a.deposit(2500);

        // Print details
        System.out.println("Account Holder: " + a.getName());
        System.out.println("Balance: " + a.getBalance());
    }
}

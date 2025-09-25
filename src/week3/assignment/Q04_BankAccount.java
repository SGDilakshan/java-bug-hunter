package week3.assignment;

/*
Create a class BankAccount with attributes accountNumber and balance.
- Provide a default constructor (balance = 0).
- Provide a parameterized constructor to initialize balance.
- Add methods deposit(double amount) and withdraw(double amount).
Test with multiple transactions.
*/

public class Q04_BankAccount {
    public static void main(String[] args) {
        // Account 1 using default constructor
        BankAccount BA1 = new BankAccount("ACC001");
        BA1.deposit(100);
        BA1.withdraw(50);
        BA1.display();

        // Account 2 using parameterized constructor
        BankAccount BA2 = new BankAccount("ACC002", 200);
        BA2.deposit(150);
        BA2.withdraw(250);  // Should show insufficient balance
        BA2.display();
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    // Default constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Parameterized constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Final Balance : " + balance);
        System.out.println("-----------------------------------");
    }
}

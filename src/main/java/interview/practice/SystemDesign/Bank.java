package interview.practice.SystemDesign;

import java.util.Scanner;
import java.util.function.Consumer;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a bank account with an initial balance
        BankAccount account = new BankAccount(1000.0);

        Consumer<Double> depositAction = amount -> account.deposit(amount);
        Consumer<Double> withdrawAction = amount -> account.withdraw(amount);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performTransaction(scanner, depositAction);
                    break;

                case 2:
                    performTransaction(scanner, withdrawAction);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    private static void performTransaction(Scanner scanner, Consumer<Double> action) {
        System.out.print("Enter transaction amount: $");
        double amount = scanner.nextDouble();
        action.accept(amount);
    }
}

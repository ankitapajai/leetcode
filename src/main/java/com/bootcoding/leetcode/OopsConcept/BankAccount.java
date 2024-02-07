package com.bootcoding.leetcode.OopsConcept;

public class BankAccount {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Before Deposited the balance is: $" + 1000);
                System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        }

        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount("123456789", "John Patel", 1000.0);

            account.deposit(500.0);
            account.withdraw(200.0);

            System.out.println("Current balance: $" + account.getBalance());
        }
    }



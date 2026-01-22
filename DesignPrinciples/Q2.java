package DesignPrinciples;

import java.util.ArrayList;


class Account {
    int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}


class Customer {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.bankName + ", Account No: " + acc.accountNumber + ", Balance: " + acc.getBalance());
        }
        System.out.println();
    }
}


class Bank {
    String bankName;
    int nextAccountNumber = 1001;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    Account openAccount(Customer customer) {
        Account account = new Account(nextAccountNumber++, this);
        customer.addAccount(account);
        return account;
    }
}


public class Q2 {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Amit");
        Customer c2 = new Customer("Neha");

        Account a1 = bank.openAccount(c1);
        Account a2 = bank.openAccount(c1);
        Account a3 = bank.openAccount(c2);

        a1.deposit(5000);
        a2.deposit(12000);
        a3.deposit(8000);

        c1.viewBalance();
        c2.viewBalance();
    }
}


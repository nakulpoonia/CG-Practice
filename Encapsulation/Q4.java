package Encapsulation;

import java.util.ArrayList;
import java.util.List;


interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}


abstract class BankAccount implements Loanable {


    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }


    public abstract double calculateInterest();


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }


    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }


    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }


    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}


class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }


    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }


    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }


    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}


public class Q4 {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Nakul", 50000));
        accounts.add(new CurrentAccount("CA202", "Ravi", 80000));

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());
            System.out.println("Loan Eligibility: " + acc.calculateLoanEligibility());

        }
    }
}

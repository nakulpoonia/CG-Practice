package Inheritance;


class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}


class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}


public class Q7 {
    public static void main(String[] args) {

        BankAccount s = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount c = new CheckingAccount("CA202", 30000, 10000);
        BankAccount f = new FixedDepositAccount("FD303", 100000, 24);

        ((SavingsAccount) s).displayAccountType();
        ((CheckingAccount) c).displayAccountType();
        ((FixedDepositAccount) f).displayAccountType();
    }
}

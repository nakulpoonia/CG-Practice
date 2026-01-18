package InstanceOf;

public class BankAccount {
    static String bankName="SBI";
    static int totalAccounts=0;

    final int accountNumber;
    String accountHolder;

    BankAccount(String accountHolder, int accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    static void getTotalaccounts(){
        System.out.println("Total Accounts: " + totalAccounts);
    }
    void displaydetails(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount c = new BankAccount("nakul",0111);
        BankAccount d = new BankAccount("aryan",0222);

        if(c instanceof BankAccount){
            c.displaydetails();
        }
        if(d instanceof BankAccount){
            d.displaydetails();
        }
        BankAccount.getTotalaccounts();
    }
}

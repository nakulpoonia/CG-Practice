package javaOOPS.level2;

public class ATM {
    String AccountHolder;
    int AccountNumber;
    double balance;

    ATM(String AccountHolder, int AccountNumber,double balance){
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }

    void diposit(double DipositAmount){
        if (DipositAmount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += DipositAmount;
        System.out.println("Deposited: " + DipositAmount);
    }

    void withdraw(double withdrawAmount){

        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= withdrawAmount;
        System.out.println("Withdrawn: " + withdrawAmount);
    }


    void display(){
        System.out.println("balance : "+balance);

    }

    public static void main(String[] args) {
        ATM c = new ATM("Nakul",0001,10000);

        c.diposit(4000);
        c.withdraw(9000);
        c.display();

    }
}


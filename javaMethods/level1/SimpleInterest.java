package JavaMethods.level1;

import java.util.Scanner;

public class SimpleInterest {


    static int calculateSimpleInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int rate = sc.nextInt();

        System.out.print("Enter Time: ");
        int time = sc.nextInt();

        int simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);


    }
}


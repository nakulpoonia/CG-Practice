package CapgeminiQuestion;

import java.util.Scanner;

public class countEvenOdd {

    static void countEvenOdd(int n) {
        int evenCount = 0;
        int oddCount = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                evenCount++;
            else
                oddCount++;

            n = n / 10;
        }

        System.out.println("Even count " + evenCount);
        System.out.println("Odd count " + oddCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        countEvenOdd(n);
    }
}


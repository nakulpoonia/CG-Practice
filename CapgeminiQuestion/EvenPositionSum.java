package CapgeminiQuestion;

import java.util.Scanner;

public class EvenPositionSum {

    static int sumEvenPositionDigits(int n) {
        String numStr = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            if ((i + 1) % 2 == 0) {
                sum += numStr.charAt(i)-'0' ;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumEvenPositionDigits(n));
    }
}


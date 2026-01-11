package CapgeminiQuestion;

import java.util.Scanner;

public class MissingNumber {

    static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // total numbers including missing

        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMissing(arr, n));
    }
}


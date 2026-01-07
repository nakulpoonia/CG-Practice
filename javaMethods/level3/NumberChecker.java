package JavaMethods.level3;

import java.util.Arrays;

public class NumberChecker {


    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        if (n == 0) return 1; // special case for 0
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }


    public static int[] storeDigits(int number) {
        int n = number;
        int size = countDigits(n);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }


    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }


    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }


    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }


    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int number = 12021;
        int number2 = 12321;

        System.out.println("Number: " + number);


        int count = countDigits(number);
        System.out.println("Count of digits: " + count);


        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));


        int[] reversed = reverseArray(digits);
        System.out.println("Reversed array: " + Arrays.toString(reversed));


        System.out.println("Digits equal reversed? " + compareArrays(digits, reversed));


        System.out.println("Is palindrome? " + isPalindrome(number));


        System.out.println("Is duck number? " + isDuckNumber(number));


        System.out.println("\nNumber: " + number2);
        System.out.println("Is palindrome? " + isPalindrome(number2));
        System.out.println("Is duck number? " + isDuckNumber(number2));
    }
}


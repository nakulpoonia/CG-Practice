package CapgeminiQuestion;

import java.util.Scanner;

public class RemoveSpecialChars {

    static String removeSpecialChars(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(removeSpecialChars(str));
    }
}


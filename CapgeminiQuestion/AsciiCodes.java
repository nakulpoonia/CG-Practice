package CapgeminiQuestion;

import java.util.Scanner;

public class AsciiCodes {

    static void printASCII(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + " : " + ascii);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printASCII(str);
    }
}


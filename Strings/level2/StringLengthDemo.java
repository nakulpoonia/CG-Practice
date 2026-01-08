package Strings.level2;

import java.util.Scanner;

public class StringLengthDemo {


    public static int findLength(String s) {
        int count = 0;

        try {
            while (true) {
            }
        } catch (StringIndexOutOfBoundsException e) {

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String text = sc.next();


        int customLength = findLength(text);


        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}


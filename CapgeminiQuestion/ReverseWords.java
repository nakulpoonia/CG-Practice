package CapgeminiQuestion;

import java.util.Scanner;

public class ReverseWords {

    public static String reverse(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String rev = reverse(s);
        System.out.print(rev);
    }
}

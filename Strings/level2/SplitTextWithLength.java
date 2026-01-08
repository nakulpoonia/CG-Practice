package Strings.level2;

import java.util.Scanner;

public class SplitTextWithLength {


    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop
        }
        return count;
    }


    public static String[] splitWords(String text) {

        int wordCount = 0;
        boolean inWord = false;

        // count words
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ' && !inWord) {
                    wordCount++;
                    inWord = true;
                } else if (ch == ' ') {
                    inWord = false;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        String[] words = new String[wordCount];
        StringBuilder sb = new StringBuilder();
        int index = 0;


        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ') {
                    sb.append(ch);
                } else if (sb.length() > 0) {
                    words[index++] = sb.toString();
                    sb.setLength(0);
                }
            } catch (StringIndexOutOfBoundsException e) {
                if (sb.length() > 0) {
                    words[index] = sb.toString();
                }
                break;
            }
        }

        return words;
    }


    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = createWordLengthTable(words);

        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]); // String → int
            System.out.println(result[i][0] + "\t" + len);
        }

        sc.close();
    }
}


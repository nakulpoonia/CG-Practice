package Strings.level2;

import java.util.Scanner;

public class TrimUsingCharAt {


    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;


        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) != ' ') {
                    start = i;
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }


        for (int i = start; ; i++) {
            try {
                text.charAt(i);
                end = i;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }


    public static String createSubstring(String text, int start, int end) {

        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }


    public static boolean areEqual(String s1, String s2) {

        // compare lengths manually
        int len1 = 0, len2 = 0;

        try { while (true) s1.charAt(len1++); }
        catch (StringIndexOutOfBoundsException e) {}

        try { while (true) s2.charAt(len2++); }
        catch (StringIndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrim = createSubstring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        boolean result = areEqual(customTrim, builtInTrim);

        System.out.println( customTrim );
        System.out.println( builtInTrim );
        System.out.println("Are both equal? " + result);


    }
}


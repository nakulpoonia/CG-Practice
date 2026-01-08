package Strings.level3;

import java.util.Scanner;

public class CharacterFrequency {


    public static int[][] findFrequency(String text) {

        int[] freq = new int[256];


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }


        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[][] frequencies = findFrequency(text);

        System.out.println(" ");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println((char) frequencies[i][0]  + frequencies[i][1]);
        }


    }
}


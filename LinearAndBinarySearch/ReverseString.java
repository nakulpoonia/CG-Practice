package LinearAndBinarySearch;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();


        String reversed = sb.toString();
        System.out.println(reversed);
    }
}


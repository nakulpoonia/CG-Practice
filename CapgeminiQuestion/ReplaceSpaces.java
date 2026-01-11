package CapgeminiQuestion;
import java.util.*;

public class ReplaceSpaces {
    public static String printString(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i)==' '){
                result.append('-');

            }
            else{
                result.append(s.charAt(i));
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sb = printString(s);
        System.out.print(sb);

    }

}

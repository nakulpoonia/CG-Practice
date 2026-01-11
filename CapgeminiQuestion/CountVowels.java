package CapgeminiQuestion;
import java.util.*;

public class CountVowels {
    public static int noOfVowels(String s){
        int count =0;
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'||
                    ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
                count++;

            }


        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowelcount = noOfVowels(s);
        System.out.print("No of vowels are "+ vowelcount);
    }
}

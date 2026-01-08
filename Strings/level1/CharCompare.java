package Strings.level1;
import java.util.*;

public class CharCompare {

    public static char[] charArray( String s){
        char[] chars = new char[s.length()];
        for(int i =0;i<s.length();i++){
            chars[i]=s.charAt(i);

        }
        return chars;
    }
    public static boolean areArraysEqual(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String s = sc.nextLine();


        char[] getcharArray = charArray(s);
        char[] builtincompare = s.toCharArray();
        Boolean isequal = areArraysEqual(getcharArray,builtincompare);

        System.out.println(getcharArray);
        System.out.println(builtincompare);
        System.out.print(isequal);



    }
}

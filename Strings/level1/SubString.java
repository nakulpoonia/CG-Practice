package Strings.level1;
import java.util.*;

public class SubString {
    public static String givesub(String s, int startindex , int stopindex){

        StringBuilder sb = new StringBuilder();
        for(int i = startindex ; i< stopindex ; i++ ){
            sb.append(s.charAt(i));


        }
        return sb.toString();
    }

    public static boolean areEqual(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String s");
        String s = sc.nextLine();
        System.out.println("Enter start index");
        int startindex = sc.nextInt();
        System.out.println("Enter stop index");
        int stopindex = sc.nextInt();



        String s1 = givesub(s,startindex,stopindex);
        String s2 = s.substring(startindex, stopindex);

        Boolean isEqual = areEqual(s1 , s2);

        System.out.println("the substring using charAt "+s1);
        System.out.println("the substring using builtin "+s2);

        System.out.print("the string are "+isEqual);



    }
    }


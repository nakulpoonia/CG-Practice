package Strings.level1;
import java.util.*;

public class CompareStrings {

    public static Boolean areEqual(String s, String v){

        int n = s.length();
        int m = v.length();

        if(n!=m){
            return false;
        }
        for(int i =0;i<n;i++){
            if(s.charAt(i)!=v.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = sc.nextLine();

        boolean isequal = areEqual(s , v);
        System.out.print("The strings are "+ isequal);
    }
}

package CapgeminiQuestion;
import java.util.*;

public class PalindromeCheck {
    public static Boolean isPalindrome(int n){
        int temp =n;
        int rev =0;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n=n/10;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean isPal= isPalindrome(n);
        System.out.print(isPal);
    }
}

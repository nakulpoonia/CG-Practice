package M1Test;


import java.util.*;
class RevDigit {
    public static void main(String[] args) {
        int a=320;
        int rev=0;
        while(a!=0){
            int digit=a%10;
            rev =rev*10+digit;
            a=a/10;
        }
        System.out.print(rev);







    }
}

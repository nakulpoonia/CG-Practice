package CapgeminiQuestion;
import java.util.*;

public class SumOfDigit {
    public static int DigitSum(int n){
        int sum =0;
        while(n!=0){
            int digit = n%10;
            sum= sum +digit;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int finalSum= DigitSum(n);
        System.out.print(finalSum);

    }


}

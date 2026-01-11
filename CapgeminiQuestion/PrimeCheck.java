package CapgeminiQuestion;
import java.util.*;

public class PrimeCheck {
    public static Boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;

            }
            break;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean result = isPrime(n);
        System.out.print(result);


    }
}

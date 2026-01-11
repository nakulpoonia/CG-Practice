package CapgeminiQuestion;
import java.util.*;

public class HcfLcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = gcd(a ,b);
        int lcm = lcm(a,b);
        System.out.println(hcf);
        System.out.print(lcm);
    }

}

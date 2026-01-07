package JavaMethods.level2;
import java.util.*;

public class SumOfNnatural {

    static int Sumrec(int n){
        if (n == 1) {
            return 1; // base case
        }
        return n + Sumrec(n - 1); // recursive step
    }

    static int SumN(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Number must be a natural number (>0).");
            sc.close();
            return;
        }

        int recvsum = Sumrec(number);
        int sum = SumN(number);

        System.out.println("normal sum is " + recvsum);
        System.out.println("recercive sum is " + sum);

        if (recvsum == sum) {
            System.out.println("Both results match. Calculation is correct.");
        } else {
            System.out.println("Mismatch! Check your computation.");
        }

    }
}

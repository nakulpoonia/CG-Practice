package JavaMethods.level2;
import java.util.*;

public class FactorsOperations {
    static int count=0;

    static int[] FindFactors (int number){
        for(int i=1 ; i <= number ; i++){
            if(number % i == 0){
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;

        for(int i=1;i <= number; i++){
            if(number % i == 0){
                factors[index]=i;
                index = index +1;
            }
        }
        return factors;



    }
    static int FindSum(int[]factors){
        int sum = 0;
        for(int f : factors){
            sum = sum + f;
        }
        return sum;
    }

    static int ProdFac(int[]factors){
        int product= 1;
        for(int f : factors){
            product = product*f;
        }
        return product;
    }

    static double Sqrsum(int[]factors){
        double sum = 0;
        for(int f : factors){
            sum = sum + Math.pow(f,2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" the number is ");
        int number = sc.nextInt();
        int[]factors = FindFactors(number);

        for(int f : factors){
            System.out.println("Factors are:" + f);


        }
        System.out.println("Sum of factors is "+ FindSum(factors));
        System.out.println("Product of factors is "+ ProdFac(factors));
        System.out.println("Sum of sqr of factors is "+ Sqrsum(factors));

    }
}

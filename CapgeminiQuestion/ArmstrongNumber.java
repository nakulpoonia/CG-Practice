package CapgeminiQuestion;

import java.util.*;
public class ArmstrongNumber {
    public static Boolean getboolean(int n){
        int temp =n;
        int sum=0;
        int count =0;
        while(temp!=0){

            count++;
            temp=temp/10;

        }
        temp=n;
        while(temp!=0){
            int number = temp%10;
            sum += (int)Math.pow(number,count);
            temp=temp/10;



        }

        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Boolean isArmstrong = getboolean(n);
        System.out.print(isArmstrong);

    }
}


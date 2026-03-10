package M1Test;


import java.util.*;
class MissingNumber {
    public static void main(String[] args) {
        int[]a={1,2,3,4,6,7,8};
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int n=a.length+1;
        int sum2=(n*(n+1))/2;
        System.out.print(sum2-sum);







    }
}

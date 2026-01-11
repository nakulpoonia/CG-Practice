package CapgeminiQuestion;
import java.util.*;

public class FibonaciSeries {
    public static int[] getSeries(int n, int arr[] ){
        arr[0]=0;
        arr[1]=1;
        for(int i =2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];


        int[] printSeries = getSeries(n,arr);
        for (int num : printSeries) {
            System.out.print(num + " ");
        }

    }
}

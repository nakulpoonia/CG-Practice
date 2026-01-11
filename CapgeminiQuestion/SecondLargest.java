package CapgeminiQuestion;
import java.util.*;

public class SecondLargest {
    public static int giveelement(int n, int arr[]){
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];

            }
            if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
            }

        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();     // read elements
        }
        int secondmax = giveelement(n,arr);
        System.out.print(secondmax);

    }


}

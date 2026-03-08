package M1PracticeQuestion;
import java.util.*;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxIndex(arr,n);

    }
    public static void maxIndex(int[]arr,int n){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}

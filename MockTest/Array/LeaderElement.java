package MockTest.Array;

import java.util.ArrayList;

public class LeaderElement {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int l = arr[n - 1];
        list.add(l);
        for (int i = arr[n - 2]; i >= 0; i--) {
            if (arr[i] > l) {
                l = arr[i];
                list.add(l);
            }
        }
        int[]arr1=new int[list.size()];
        int index=0;
        for(int x:list){
            arr1[index++]=x;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}

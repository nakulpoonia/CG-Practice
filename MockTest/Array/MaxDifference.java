package MockTest.Array;

public class MaxDifference {
    public static void main(String[] args) {
        int diff=0;
        int maxDiff=0;
        int[]arr={2,7,3,1,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                diff=arr[j]-arr[i];
            }
            maxDiff=Math.max(maxDiff,diff);
        }
        System.out.println(maxDiff);
    }
}

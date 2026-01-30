package LinearAndBinarySearch;
import java.util.*;
class Solution {
    public static int RotationPoint( int n,int[] arr) {

        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid]>arr[high]){
                low = mid +1;
            }
            else{
                high=mid;
            }

        }
        return low;
    }
}

class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(Solution.RotationPoint(n,arr));

    }
}

package MockTest.Array;

public class SwapArray {
    public static void main(String[] args) {
        int[]arr={5,2,0,1,6};
        for(int i=0;i<arr.length-1;i=i+2){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

package MockTest.Array;

public class SplitCheck {
    public static void main(String[] args) {
        
        int sum2=0;
        int[]a={1,2,3,4,5,5};
        for(int i=a.length-1;i>=1;i--){
            sum2=sum2+a[i];
            int sum1=0;
            for(int j=0;j<i;j++){
                sum1=sum1+a[j];
                if(sum1==sum2){
                    System.out.println("yes");
                    return;
                }

            }

        }System.out.println("no");

    }
}

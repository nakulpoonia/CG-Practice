package Strings.level1;
import java.util.*;

public class arrayoutofbound {

    public static void generateexception(String[]arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

        public static void outofbound(String[]arr){
            for(int i=0;i<=arr.length;i++){

                try{
                    System.out.print(arr[i]);

                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println();
                    System.out.print("Exception");

                }
            }

        }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();



        String[] arr = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        sc.nextLine();




        outofbound(arr);
    }

}

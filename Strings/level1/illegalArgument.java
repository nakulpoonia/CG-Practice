package Strings.level1;
import java.util.*;

public class illegalArgument {
    public static void generateException(String s, int start , int end){
        String sub = s.substring(start,end);
        System.out.print(sub);
    }
    public static void illegalargument(String s,int start,int end){
        try{
            String sub = s.substring(start,end);

            System.out.print(sub);
        }
        catch(IllegalArgumentException e){
            System.out.print("exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        generateException(s , start , end);

    }
}

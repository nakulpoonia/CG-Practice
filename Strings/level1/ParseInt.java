package Strings.level1;
import java.util.*;

public class ParseInt {
    public static void generateexception(String s){
        System.out.print(Integer.parseInt(s));

    }
    public static void numberFormat(String s){

        try{
            System.out.print(Integer.parseInt(s));

        } catch (NumberFormatException e) {
            System.out.println();
            System.out.print("ecxeption");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        numberFormat(s);

    }
}

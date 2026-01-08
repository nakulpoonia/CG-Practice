package Strings.level1;
import java.util.*;



public class nullPointer {


    public static void nullexception(){
         String s =null;
         System.out.print(s.length());

    }

    public static void giveException(String s){
        try{
            System.out.print(s.length());
        } catch (Exception e) {
            System.out.print("exception");

        }
    }

    public static void main(String[] args) {

        nullexception();
    }
}


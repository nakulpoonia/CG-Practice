package Strings.level1;
import java.util.*;

public class IndexBondException {

    // Method to GENERATE exception (no try-catch)
    public static void generateException(String s) {
        for (int i = 0; i <= s.length(); i++) { //
            System.out.print(s.charAt(i));
        }
    }

    // Method to HANDLE exception
    public static void handleException(String s) {
        try {
            for (int i = 0; i <= s.length(); i++){ // ❌ same mistake
                System.out.print(s.charAt(i));
            }

        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();



        // 2️⃣ Handle exception safely
        handleException(s);
    }
}

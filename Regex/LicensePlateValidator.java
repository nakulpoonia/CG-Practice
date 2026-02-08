package Regex;

import java.util.*;

public class LicensePlateValidator {

    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String plate = sc.nextLine();

        System.out.println(isValidPlate(plate) ? "Valid" : "Invalid");


    }
}


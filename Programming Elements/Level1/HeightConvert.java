package ProgrammingElements.Level1;

import java.util.Scanner;

public class HeightConvert {
    public static void main(String[] args) {

        // user input
        Scanner input = new Scanner(System.in);

        // Take user input for height
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = heightCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        // Close Scanner
        input.close();
    }
}

package ProgrammingElements.Level1;

import java.util.Scanner;
public class KmToMilesUserInput {
    public static void main(String[] args) {

        // user input
        Scanner input = new Scanner(System.in);

        // Declare variable
        double km;

        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion factor: 1 km = 1.6 miles
        double miles = km * 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close Scanner
        input.close();
    }
}

package ProgrammingElements.Level1;

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {

        // take input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760.0;

        // Display results
        System.out.println("The distance in yards is " + distanceInYards +
                " and in miles is " + distanceInMiles);

        // Close Scanner
        input.close();
    }
}


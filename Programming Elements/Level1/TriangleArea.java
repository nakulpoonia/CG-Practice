package ProgrammingElements.Level1;

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * base * height;

        // Convert area to square centimeter
        double areaCm = areaInches * Math.pow(2.54, 2);

        // Display results
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");

        // Close Scanner
        input.close();
    }
}

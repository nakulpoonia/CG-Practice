package ProgrammingElements.Level2;
import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1 (meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2 (meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3 (meters): ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters

        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        input.close();
    }
}

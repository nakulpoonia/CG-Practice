package ProgrammingElements.Level2;
import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("From city: ");
        String fromCity = input.nextLine();

        System.out.print("Via city: ");
        String viaCity = input.nextLine();

        System.out.print("To city: ");
        String toCity = input.nextLine();

        System.out.print("Distance from " + fromCity + " to " + viaCity + " (miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Distance from " + viaCity + " to " + toCity + " (miles): ");
        double viaToFinal = input.nextDouble();

        System.out.print("Time taken (hours): ");
        double time = input.nextDouble();

        double totalDistance = fromToVia + viaToFinal;
        double speed = totalDistance / time;

        System.out.println(name + " traveled from " + fromCity + " to " + toCity +
                " via " + viaCity + ". Total distance is " + totalDistance +
                " miles in " + time + " hours at an average speed of " + speed + " mph.");

        input.close();
    }
}


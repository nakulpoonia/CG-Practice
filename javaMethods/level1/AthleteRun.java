package JavaMethods.level1;

import java.util.Scanner;

public class AthleteRun {


    static int calculateRounds(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (in meters): ");
        int side1 = sc.nextInt();

        System.out.print("Enter side 2 (in meters): ");
        int side2 = sc.nextInt();

        System.out.print("Enter side 3 (in meters): ");
        int side3 = sc.nextInt();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds +" rounds to finish a 5 km run.");


    }
}

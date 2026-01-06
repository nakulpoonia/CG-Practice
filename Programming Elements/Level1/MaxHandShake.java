package ProgrammingElements.Level1;

import java.util.Scanner;

public class MaxHandShake {
    public static void main(String[] args) {

        // take input
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        // Close Scanner
        input.close();
    }
}

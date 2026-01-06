package ProgrammingElements.Level1;

import java.util.Scanner;
public class Calculator {

        public static void main(String[] args) {

            // Create Scanner object to take input
            Scanner input = new Scanner(System.in);

            // Take user input for two numbers
            System.out.print("Enter the first number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = input.nextDouble();

            // Perform arithmetic operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number1 / number2;

            // Display results
            System.out.println("The addition, subtraction, multiplication and division value of " +
                    number1 + " and " + number2 + " is " +
                    addition + ", " + subtraction + ", " + multiplication + ", and " + division);

            // Close Scanner
            input.close();

        }
        }

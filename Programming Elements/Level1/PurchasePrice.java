package ProgrammingElements.Level1;

import java.util.Scanner;
public class PurchasePrice {

        public static void main(String[] args) {

            // Create Scanner object to take input
            Scanner input = new Scanner(System.in);

            // Take user input for unit price
            System.out.print("Enter the unit price of the item (INR): ");
            double unitPrice = input.nextDouble();

            // Take user input for quantity
            System.out.print("Enter the quantity to be bought: ");
            int quantity = input.nextInt();

            // Calculate total price
            double totalPrice = unitPrice * quantity;

            // Display the result
            System.out.println("The total purchase price is INR " + totalPrice +
                    " if the quantity " + quantity + " and unit price is INR " + unitPrice);

            // Close Scanner
            input.close();
        }
}

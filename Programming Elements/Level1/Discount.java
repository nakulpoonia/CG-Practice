package ProgrammingElements.Level1;

public class Discount {
    public static void main(String[] args) {

        // Course fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

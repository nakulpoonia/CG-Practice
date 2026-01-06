package ProgrammingElements.Level1;

public class ProfitLoss {
    public static void main(String[] args) {

        // Cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit * 100.0) / costPrice;

        // Display result
        System.out.println("Profit Calculation:\n" +
                "Cost Price: INR " + costPrice + "\n" +
                "Selling Price: INR " + sellingPrice + "\n" +
                "Profit: INR " + profit + "\n" +
                "Profit Percentage: " + profitPercentage + "%");
    }
}


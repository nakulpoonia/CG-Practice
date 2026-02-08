package Java8;
class Sale {
    private int productId;
    private int quantity;
    private double price;

    public Sale(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

public class ProductSales {
    private int productId;
    private double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public int getProductId() { return productId; }
    public double getTotalRevenue() { return totalRevenue; }


    public String toString() {
        return "ProductSales{productId=" + productId + ", totalRevenue=" + totalRevenue + "}";
    }
}


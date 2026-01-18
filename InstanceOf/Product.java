package InstanceOf;

class Product {


    static double discount = 0.0;


    String productName;
    double price;
    int quantity;
    final int productID;


    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }


    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }


    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }



    public static void main(String[] args) {

        Product c = new Product("Laptop", 60000, 1, 1001);


        if (c instanceof Product) {
            c.displayDetails();
        }


        Product.updateDiscount(10);
    }
    }



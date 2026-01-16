package Constructors.InstaneVsClassVariables;

public class Product {
    String productName;
    double price;
    static int totalProducts=0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("productName :" + productName);
        System.out.println("price :" + price);


    }
    static void displayTotalProducts(){
        System.out.println("totalProducts :"+totalProducts);
    }

    public static void main(String[] args) {
        Product C = new Product("car",500);
        C.displayProductDetails();
        Product.displayTotalProducts();
    }
}

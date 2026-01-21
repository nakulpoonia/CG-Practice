package Encapsulation;

import java.util.ArrayList;
import java.util.List;


interface Taxable {
    double calculateTax();
    String getTaxDetails();
}


abstract class Product {


    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    public abstract double calculateDiscount();


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}


class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }


    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }


    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }


    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}


class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }


    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }


    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }


    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}


class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}


public class Q2 {

    public static void calculateFinalPrice(List<Product> products) {

        for (Product p : products) {

            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Final Price: " + finalPrice);

        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 1000));

        calculateFinalPrice(products);
    }
}

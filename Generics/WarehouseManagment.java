package Generics;

import java.util.*;


abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract String getCategory();


    public String toString() {
        return getCategory() + " -> " + name + " (₹" + price + ")";
    }
}


class Electronics extends WarehouseItem {
    private int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    public String getCategory() {
        return "Electronics";
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }


    public String getCategory() {
        return "Groceries";
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }

    public String getMaterial() {
        return material;
    }
}


class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getAllItems() {
        return items;
    }
}


class WarehouseUtils {


    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}


public class WarehouseManagment {
    public static void main(String[] args) {


        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 75000, 2));
        electronicsStorage.addItem(new Electronics("Phone", 45000, 1));


        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 60, "2026-02-10"));
        groceriesStorage.addItem(new Groceries("Rice", 1200, "2026-12-01"));


        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa", 25000, "Wood"));
        furnitureStorage.addItem(new Furniture("Chair", 3000, "Plastic"));


        WarehouseUtils.displayAllItems(electronicsStorage.getAllItems());


        WarehouseUtils.displayAllItems(groceriesStorage.getAllItems());


        WarehouseUtils.displayAllItems(furnitureStorage.getAllItems());
    }
}


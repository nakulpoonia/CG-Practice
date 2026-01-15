package javaOOPS.level1;

public class Item {
    String itemName;
    double itemCode;
    double price;


    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost(quantity));
    }


    double totalCost(int quantity){
        return price*quantity;
    }

    public static void main(String[] args) {
        Item c = new Item(101,"main",200);
        c.display(5);
    }
}

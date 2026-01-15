package javaOOPS.level2;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        if (qty <= 0) {
            System.out.println("Invalid quantity to add");
            return;
        }
        quantity += qty;
        System.out.println(qty + " item(s) added to cart");
    }

    void removeItem(int qty) {

        if (qty > quantity) {
            System.out.println("Not enough items in cart");
            return;
        }
        quantity -= qty;
        System.out.println(qty + " item(s) removed from cart");
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Book", 150);

        item.addItem(3);
        item.displayTotalCost();

        item.removeItem(1);
        item.displayTotalCost();
    }
}


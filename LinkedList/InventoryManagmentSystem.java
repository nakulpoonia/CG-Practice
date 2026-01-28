package LinkedList;
 class InventoryLinkedList {

    private class Node {
        int itemId;
        String itemName;
        int quantity;
        double price;
        Node next;

        Node(int itemId, String itemName, int quantity, double price) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private Node head;

    public void addAtBeginning(int id, String name, int qty, double price) {
        Node n = new Node(id, name, qty, price);
        n.next = head;
        head = n;
    }

    public void addAtEnd(int id, String name, int qty, double price) {
        Node n = new Node(id, name, qty, price);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null)
            t = t.next;
        t.next = n;
    }

    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 0) return;

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        Node t = head;
        for (int i = 1; i < pos - 1 && t != null; i++)
            t = t.next;

        if (t == null) return;

        Node n = new Node(id, name, qty, price);
        n.next = t.next;
        t.next = n;
    }

    public void removeByItemId(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        Node t = head;
        while (t.next != null && t.next.itemId != id)
            t = t.next;

        if (t.next != null)
            t.next = t.next.next;
    }

    public void updateQuantity(int id, int newQty) {
        Node t = head;
        while (t != null) {
            if (t.itemId == id) {
                t.quantity = newQty;
                return;
            }
            t = t.next;
        }
    }

    public void searchByItemId(int id) {
        Node t = head;
        while (t != null) {
            if (t.itemId == id) {
                displayNode(t);
                return;
            }
            t = t.next;
        }
    }

    public void searchByItemName(String name) {
        Node t = head;
        while (t != null) {
            if (t.itemName.equalsIgnoreCase(name))
                displayNode(t);
            t = t.next;
        }
    }

    public void displayAll() {
        Node t = head;
        while (t != null) {
            displayNode(t);
            t = t.next;
        }
    }

    public double totalInventoryValue() {
        double sum = 0;
        Node t = head;
        while (t != null) {
            sum += t.price * t.quantity;
            t = t.next;
        }
        return sum;
    }

    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private Node mergeSort(Node h, boolean asc, boolean byName) {
        if (h == null || h.next == null)
            return h;

        Node mid = getMiddle(h);
        Node next = mid.next;
        mid.next = null;

        Node left = mergeSort(h, asc, byName);
        Node right = mergeSort(next, asc, byName);

        return merge(left, right, asc, byName);
    }

    private Node merge(Node a, Node b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName)
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        Node result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, asc, byName);
        } else {
            result = b;
            result.next = merge(a, b.next, asc, byName);
        }
        return result;
    }

    private Node getMiddle(Node h) {
        if (h == null) return h;

        Node slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private void displayNode(Node n) {
        System.out.println(
                n.itemId + " " +
                        n.itemName + " " +
                        n.quantity + " " +
                        n.price
        );
    }
}



public class InventoryManagmentSystem {
    public static void main(String[] args) {

        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtBeginning(101, "Keyboard", 5, 800);
        inv.addAtEnd(102, "Mouse", 10, 400);
        inv.addAtEnd(103, "Monitor", 3, 12000);
        inv.addAtPosition(2, 104, "Laptop", 2, 55000);

        inv.displayAll();

        inv.updateQuantity(102, 15);
        inv.searchByItemId(104);
        inv.searchByItemName("Mouse");

        System.out.println(inv.totalInventoryValue());

        inv.sortByName(true);
        inv.displayAll();

        inv.sortByPrice(false);
        inv.displayAll();

        inv.removeByItemId(101);
        inv.displayAll();
    }
}

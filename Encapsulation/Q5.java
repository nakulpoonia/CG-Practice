package Encapsulation;

import java.util.ArrayList;
import java.util.List;


interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}


abstract class LibraryItem implements Reservable {


    private int itemId;
    private String title;
    private String author;
    private boolean available = true;


    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }


    public abstract int getLoanDuration();


    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + available);
    }



    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            this.available = false;
        }
    }


    public boolean checkAvailability() {
        return available;
    }
}


class Book extends LibraryItem {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }


    public int getLoanDuration() {
        return 21;
    }
}


class Magazine extends LibraryItem {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }


    public int getLoanDuration() {
        return 7;
    }
}


class DVD extends LibraryItem {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }


    public int getLoanDuration() {
        return 5;
    }
}


public class Q5 {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Basics", "James Gosling"));
        items.add(new Magazine(2, "Tech Today", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            item.reserveItem("User1");
            System.out.println("After Reservation - Available: " + item.checkAvailability());

        }
    }
}


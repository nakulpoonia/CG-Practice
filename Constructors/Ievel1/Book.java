package Constructors.Ievel1;

public class Book {
    String title;
    String author;
    double price;


    Book() {
        title = "krishna";
        author = "osho";
        price = 0.0;
    }


    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book c = new Book();
        Book v = new Book("philosophy","osho",500);
        c.displayBook();
        v.displayBook();

    }
}

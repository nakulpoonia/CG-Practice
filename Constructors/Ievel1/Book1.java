package Constructors.Ievel1;

class Book1 {
    String title;
    String author;
    double price;
    boolean available;


    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }


    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book1 book = new Book1("Clean Code", "Robert C. Martin", 499.0);

        book.displayDetails();
        book.borrowBook();
        book.borrowBook();
        book.displayDetails();
    }
}


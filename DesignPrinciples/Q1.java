package DesignPrinciples;

import java.util.ArrayList;


class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}


class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
        System.out.println();
    }
}


public class Q1 {
    public static void main(String[] args) {


        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Atomic Habits", "James Clear");


        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");


        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);


        library1.showBooks();
        library2.showBooks();
    }
}


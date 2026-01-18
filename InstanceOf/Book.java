package InstanceOf;

public class Book {
    static String libraryName ="apex Library";
    String title;
    String author;
    final int isbn;

    Book (String title, String author, int isbn){
        this.title=title;
        this.author=author;
        this.isbn= isbn;
    }
    static void displayLibraryName(){
        System.out.print(libraryName);
    }
    void displayDeyails(){
        System.out.println(title);
        System.out.println(author);

    }

    public static void main(String[] args) {
        Book c = new Book("philosohy","nakul",01);
        if(c instanceof Book){
            c.displayDeyails();
        }
        Book.displayLibraryName();
    }

}

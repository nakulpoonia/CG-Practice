package Inheritance;



class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class author extends Book {
    String name;
    String bio;

    author(String name, String bio, String title, int publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;

    }


    void displayDetails() {
        System.out.println("title :" + title);
        System.out.println("publication year :" + publicationYear);
        System.out.println("name :" + name);
        System.out.println("bio :" + bio);
    }
}



public class Q2{
    public static void main(String[] args) {
        author c = new author("Animal Farm", "hello", "George Orwell", 1945);
        c.displayDetails();
    }


}


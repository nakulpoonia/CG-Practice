package Inheritance;

class Book1 {
    String title;
    int publicationYear;

    Book1(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}


class Author extends Book1 {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}


public class Q4 {
    public static void main(String[] args) {

        Author a = new Author("1984", 1949, "George Orwell", "English novelist and essayist");

        a.displayInfo();
    }
}


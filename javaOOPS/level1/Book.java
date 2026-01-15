package javaOOPS.level1;

public class Book {
    String title;
    String author;
    double price;

    void display(){
        System.out.println("title : "+ title);
        System.out.println("author : "+ author);
        System.out.print("title : "+ price);

    }

    public static void main(String[] args) {
        Book c = new Book();
        c.title= "capgemini";
        c.author="nakul";
        c.price= 200;
        c.display();
    }
}

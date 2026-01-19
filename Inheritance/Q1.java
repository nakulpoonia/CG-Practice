package Inheritance;

class Animal {
    String name;
    int age;
    Animal(String name,int age){
        this.name= name;
        this.age = age;
    }

    void makeSound(){
        System.out.print("Animals make sound");


    }
}
class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound(){
        System.out.println("bark");
    }
}
class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound(){
        System.out.println("meow");
    }

}
class Bird extends Animal{
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound(){
        System.out.println("chirp");
    }
}
public class Q1{
    public static void main(String[] args) {
        Animal c = new Dog("jimmy", 3);
        Animal d = new Cat("Tommy", 2);
        Animal e = new Bird("Molly", 1);

        d.makeSound();
        c.makeSound();
        e.makeSound();
    }
}




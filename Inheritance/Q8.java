package Inheritance;


class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}


interface Worker {
    void performDuties();
}


class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }


    public void performDuties() {
        System.out.println("Chef is cooking food.");
    }
}


class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter is serving food to customers.");
    }
}


public class Q8 {
    public static void main(String[] args) {

        Worker c = new Chef("Ramesh", 101);
        Worker w = new Waiter("Suresh", 102);

        c.performDuties();
        w.performDuties();
    }
}


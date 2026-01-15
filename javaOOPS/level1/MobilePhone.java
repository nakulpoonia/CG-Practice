package javaOOPS.level1;

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void display(){
        System.out.println("brand : "+brand);
        System.out.println("model :"+model);
        System.out.print("price :"+price);

    }

    public static void main(String[] args) {
        MobilePhone c = new MobilePhone("Samsung","S25",70000);
        c.display();
    }

}

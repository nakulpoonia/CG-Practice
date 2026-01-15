package javaOOPS.level1;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
    double circumference(){
        return 2*Math.PI*radius;
    }

    void display(){
        System.out.println(area());
        System.out.print(circumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(4);
        c.display();
    }
}

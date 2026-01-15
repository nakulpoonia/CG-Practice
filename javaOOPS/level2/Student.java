package javaOOPS.level2;

public class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }
    void display(){
        System.out.println("name :"+ name);
        System.out.println("rollNumber :"+ rollNumber);
        System.out.println("marks :"+ marks);
        System.out.println("grade :"+ calculateGrade());
    }

    public static void main(String[] args) {
        Student c = new Student("nakul",1951,70);
        Student s = new Student("nikhil",1981,60);
        c.display();
        s.display();
    }

}

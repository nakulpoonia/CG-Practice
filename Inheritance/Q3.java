package Inheritance;

class Employee{
    String name;
    int id;
    double salary;

    Employee(String name , int id , double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("name :"+ name);
        System.out.println("id :"+ id);
        System.out.println("salary :"+ salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name, int id, double salary,int teamSize) {

        super(name, id, salary);
        this.teamSize = teamSize;
    }


    void displayDetails(){

        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }


}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }


    void displayDetails() {

        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}




public class Q3 {
    public static void main(String[] args) {
        Employee c = new Manager("nakul",101,500000,20);
        Employee d = new Developer("nikhil",102,400000,"java");

        c.displayDetails();
        d.displayDetails();

    }
}

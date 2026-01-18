package InstanceOf;

class Employee {


    static String companyName = "TechCorp";
    private static int totalEmployees = 0;


    String name;
    final int id;
    String designation;


    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }


    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }


    void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }



    public static void main(String[] args) {

        Employee c = new Employee("Nakul", 101, "Developer");


        if (c instanceof Employee) {
            c.displayDetails();
        }


        Employee.displayTotalEmployees();
    }
    }



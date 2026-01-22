package DesignPrinciples;

import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void display() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    Department getDepartment(String deptName) {
        for (Department d : departments) {
            if (d.name.equals(deptName)) {
                return d;
            }
        }
        return null;
    }

    void show() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.display();
        }
        System.out.println();
    }

    void deleteCompany() {
        departments.clear();
    }
}

public class Q3 {
    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.getDepartment("IT").addEmployee("Amit");
        company.getDepartment("IT").addEmployee("Neha");

        company.getDepartment("HR").addEmployee("Rohit");

        company.show();

        company.deleteCompany();

        System.out.println("Company deleted. Departments and Employees removed.");
    }
}


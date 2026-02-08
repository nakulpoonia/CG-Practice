
package Java8;
import java.util.*;
import java.util.stream.*;
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }


    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}




class Main {

    public static Map<String, Double> averageSalaryByDepartment(List<Employee> employees) {


        List<Employee> filteredSorted = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("Engineering"))
                .filter(e -> e.getSalary() > 80000)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());


        return filteredSorted.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Nakul", "Engineering", 95000),
                new Employee(2, "Aman", "Engineering", 75000),
                new Employee(3, "Riya", "HR", 85000),
                new Employee(4, "Kunal", "Engineering", 120000),
                new Employee(5, "Meena", "Engineering", 88000)
        );

        Map<String, Double> result = averageSalaryByDepartment(employees);

        System.out.println(result);
    }
}


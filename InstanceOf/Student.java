package InstanceOf;

class Student {


    static String universityName = "ABC University";
    private static int totalStudents = 0;


    String name;
    final int rollNumber;
    String grade;


    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }


    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }


    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }


    void updateGrade(String newGrade) {
        this.grade = newGrade;
    }


    public static void main(String[] args) {

        Object obj = new Student("Nakul", 101, "A");


        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.displayDetails();
            s.updateGrade("A+");
        }


        Student.displayTotalStudents();
    }
}



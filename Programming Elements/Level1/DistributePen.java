package ProgrammingElements.Level1;

public class DistributePen {
    public static void main(String[] args) {

        // Total pens and students
        int totalPens = 14;
        int students = 3;

        // Pens per student
        int pensPerStudent = totalPens / students;

        // Remaining pens
        int remainingPens = totalPens % students;

        // Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}


package ProgrammingElements.Level1;

public class SamAveragePCM {
    public static void main(String[] args) {

        // Marks obtained
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Maximum marks for each subject
        int maxMarks = 100;

        // Calculate percentage for each subject
        double mathsPercentage = (mathsMarks * 100.0) / maxMarks;
        double physicsPercentage = (physicsMarks * 100.0) / maxMarks;
        double chemistryPercentage = (chemistryMarks * 100.0) / maxMarks;

        // Calculate average percentage
        double averagePercentage = (mathsPercentage + physicsPercentage + chemistryPercentage) / 3.0;

        // Display results
        System.out.println("Sam’s average percentage in PCM is " + averagePercentage + "%");
    }
}



package Strings.level3;
import java.util.Scanner;

public class BMIReport {


    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.format("%.2f", bmi),
                status
        };
    }


    public static String[][] generateBMIReport(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return result;
    }


    public static void display(String[][] report) {

        System.out.println(" ");


        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                            report[i][1] + "\t\t" +
                            report[i][2] + "\t" +
                            report[i][3]
            );
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; // [weight][height]

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height ");
            data[i][1] = sc.nextDouble();
        }

        String[][] report = generateBMIReport(data);
        display(report);


    }
}


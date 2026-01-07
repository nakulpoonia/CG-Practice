package JavaMethods.level2;
import java.util.*;

public class UnitConverter {

    public static double farhenheit2celsius(double farhenheit){
        return (farhenheit - 32) * 5 / 9;
    }
    public static double celsius2farhenheit( double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double pounds2kilograms( double pounds){
        return 0.453592*pounds;
    }
    public static double kilograms2pounds(double kilograms){
        return 2.20462*kilograms;
    }
    public static double gallons2liters(double gallons){
        return 3.78541*gallons;
    }
    public static double liters2gallons(double liters){
        return 0.264172*liters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double farhenheit = sc.nextDouble();
        double celcius = sc.nextDouble();
        double pounds = sc.nextDouble();
        double kilograms = sc.nextDouble();
        double gallons = sc.nextDouble();
        double liters = sc.nextDouble();

        double farhenheit2celsius = farhenheit2celsius(farhenheit);
        double celsius2farhenheit = celsius2farhenheit(celcius);
        double pounds2kilograms = pounds2kilograms(pounds);
        double kilograms2pounds = kilograms2pounds(kilograms);
        double gallons2liters = gallons2liters(gallons);
        double liters2gallons = liters2gallons(liters);

        System.out.println("farhenheit2celsius is "+ farhenheit2celsius);
        System.out.println("celsius2farhenheit is "+ celsius2farhenheit);
        System.out.println("pounds2kilograms is "+ pounds2kilograms);
        System.out.println("kilograms2pounds is "+ kilograms2pounds);
        System.out.println("gallons2liters is "+ gallons2liters);
        System.out.println("liters2gallons is "+ liters2gallons);




    }
}

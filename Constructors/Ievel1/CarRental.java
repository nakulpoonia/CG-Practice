package Constructors.Ievel1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;


    CarRental() {
        this("Unknown", "Standard", 1, 1000.0);
    }


    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRentalDetails() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel +", Rental Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Nakul", "SUV", 5, 2000.0);

        r1.displayRentalDetails();
        r2.displayRentalDetails();
    }
}


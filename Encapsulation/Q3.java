package Encapsulation;

import java.util.ArrayList;
import java.util.List;


interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}


abstract class Vehicle {


    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }


    public abstract double calculateRentalCost(int days);


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected double getRentalRate() {
        return rentalRate;
    }

    protected void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}


class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNumber;
    }


    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }


    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }


    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}


class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNumber;
    }


    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
    }


    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }


    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}


class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNumber;
    }


    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }


    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }


    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}


public class Q3 {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-02"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-03"));

        int days = 3;

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance();
            }

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);

        }
    }
}


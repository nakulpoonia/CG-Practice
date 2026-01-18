package InstanceOf;

class Vehicle {


    static double registrationFee = 5000.0;


    String ownerName;
    String vehicleType;
    final String registrationNumber;


    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }


    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }


    void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }


    public static void main(String[] args) {

        Vehicle obj = new Vehicle("Nakul", "Car", "RJ14AB1234");
        Vehicle.updateRegistrationFee(6000.0);


        if (obj instanceof Vehicle) {
            obj.displayRegistrationDetails();
        }



    }
}



package Constructors.InstaneVsClassVariables;

public class Vehicle {
    String ownerName;
    String carType;
    static double registrationFee=0;

    Vehicle(String ownerName,String carType){
        this.carType=carType;
        this.ownerName=ownerName;
    }
    void displayVehicleDetails(){
        System.out.println("ownerName :"+ownerName);
        System.out.println("carType :"+carType);
    }
    static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
        System.out.println(newFee);
    }

    public static void main(String[] args) {
        Vehicle c = new Vehicle("nakul","sedan");
        Vehicle.updateRegistrationFee(10000);
    }

}

package InstanceOf;

class Patient {

    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(ailment);
        System.out.println(patientID);
        System.out.println(hospitalName);
    }


    public static void main(String[] args) {
       Patient obj = new Patient("Nakul", 25, "Flu", 101);

        if (obj instanceof Patient) {
            obj.displayDetails();
        }

        Patient.getTotalPatients();
    }
}



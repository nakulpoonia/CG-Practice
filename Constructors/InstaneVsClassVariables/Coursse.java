package Constructors.InstaneVsClassVariables;

public class Coursse {
    String courseName;
    String duration;
    double fee;

    static String instituteName="ABC";

    Coursse(String courseName, String duration,double fee){
        this.courseName=courseName;
        this.fee=fee;
        this.duration=duration;
    }

    void displayCourseDetails(){
        System.out.println("courseName :"+courseName);
        System.out.println("fee :"+fee);
        System.out.println("duration :"+duration);
        System.out.println("instituteName :"+instituteName);

    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("updated institute name :"+newName);
    }

    public static void main(String[] args) {
        Coursse C = new Coursse("java","3hours",5000);
        C.displayCourseDetails();
        Coursse.updateInstituteName("Chitkara");
    }
}

package src.com.tutorial.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setName("John Doe");
        patient.setAge(30);

        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient Age: " + patient.getAge());
    }
}

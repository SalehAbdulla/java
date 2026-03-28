package model;

import java.util.ArrayList;

public class NetworkEngineer extends Employee {

    private ArrayList<NetworkEngineerCertificate> certificates = new ArrayList<>();

    public NetworkEngineer(String firstName, String lastName, String address, int age, String specialist, ArrayList<NetworkEngineerCertificate> certificates) {
        super(firstName, lastName, address, age, specialist);
        this.certificates.addAll(certificates);
    }

    public void printWhatIDo(){
        System.out.println("Hello, I'm " + getFirstName() + ", a " + getSpecialist());

        System.out.println("This is the networking certificates I own");

        for (NetworkEngineerCertificate net : certificates) {
            System.out.println(net);
        }
    }

    @Override
    public void getVacationDays() {
        System.out.println("I receive 30 days vacation as I do a lot of overtime during the year.");
    }
}

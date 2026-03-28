package model;

import java.util.ArrayList;

public class SoftwareEngineer extends Employee {

    private ArrayList<ProgrammingLanguage> programmingLanguages = new ArrayList<>();
    private int numberOfCodeWritten;

    public SoftwareEngineer(String firstName, String lastName, String address, int age, String specialist, ArrayList<ProgrammingLanguage> programmingLanguages, int numberOfCodeWritten) {
        super(firstName, lastName, address, age, specialist);
        this.programmingLanguages.addAll(programmingLanguages);
        this.numberOfCodeWritten = numberOfCodeWritten;
    }

    public void createProgram(){
        this.numberOfCodeWritten += 100;
    }

    public void printWhatIDo() {
        System.out.println("Hello, I'm " + getFirstName() + " a " + getSpecialist());
        System.out.println("This is the programming languages I mainly use, ");
        for (ProgrammingLanguage pro : programmingLanguages) {
            System.out.println(pro);
        }
        System.out.println("The number of codes written in the company: " + numberOfCodeWritten);
    }

}

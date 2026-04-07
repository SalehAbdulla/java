import java.util.ArrayList;

import static java.lang.System.exit;

public class Person {

    private String firstName;
    private ArrayList<Residence> residenceList = new ArrayList<>();

    public Person(String firstName, Residence residence) {
        this.firstName = firstName;
        if (residence == null) {
            System.out.println("residence cannot be null!!!!!!");
            exit(1);
        }
        residenceList.add(residence);
        residence.setOwnerPerson(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<Residence> getResidenceList() {
        return residenceList;
    }

    public void setResidenceList(ArrayList<Residence> residenceList) {
        this.residenceList = residenceList;
    }

}

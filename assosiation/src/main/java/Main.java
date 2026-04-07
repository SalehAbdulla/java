public class Main {
    public static void main(String[] args) {
        Residence sanabisHouse = new Residence("972", 10);

        Residence amwajHouse = new Residence("1000", 200);

        Person hussain = new Person("HUSSAIN", sanabisHouse);

        amwajHouse.setOwnerPerson(hussain);

        hussain.getResidenceList().add(amwajHouse);

        for (Residence re: hussain.getResidenceList()) {
            System.out.println(re.getAddress());
        }

       //  person -> house   1 -> *

    }
}




// Create an application that link hussain with his devices
// -> Make sure its is bi-directional
// from the iPhone object, print owner name which is you hussin
// from hussain, print iPhone model









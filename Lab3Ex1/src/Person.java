import java.util.ArrayList;

public class Person {
    private String fullName;
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Person> ownersComputer = new ArrayList<>();
    private ArrayList<Computer> borrowedComputers = new ArrayList<>();

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public ArrayList<Person> getOwnersComputer() {
        return ownersComputer;
    }

    public void setOwnersComputer(ArrayList<Person> ownersComputer) {
        this.ownersComputer = ownersComputer;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public Person(String fullName, Computer computer) {
        this.fullName = fullName;
        computer.setOwner(this);
        this.computers.add(computer);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void printComputersInfo() {
        System.out.println(this.getFullName() + "'s computers");
        if (computers.isEmpty()) {
            System.out.println("no computers found!");
            return;
        }
        for (Computer comp: computers) {
            System.out.println("Make: " + comp.getMake() + ", Model: " + comp.getModel());
        }
    }

    public void buyComputer(Computer computer) {
        if (computer.getOwner() == this) {
            System.out.println("You're already the owner of this computer, you don't have to buy it again");
        } else {
            computer.setOwner(this);
            computers.add(computer);
            ownersComputer.add(computer.getOwner());
        }
    }

    public void borrowComputer(Computer computer) {
        if (borrowedComputers.contains(computer)) {
            System.out.println("You've already borrowed this computer, why you want to borrow it again ");
        } else {
            borrowedComputers.add(computer);
            computer.setBorrower(this);
        }
    }

    public void printBorrowedComputersInfo() {
        System.out.println(this.getFullName() + "'s borrowed computers");
        if (borrowedComputers.isEmpty()) {
            System.out.println("No borrowed computers found");
            return;
        }
        for (Computer comp: borrowedComputers) {
            System.out.println("Computer Owner: " + comp.getOwner().getFullName() + ", Make: " +  comp.getMake() + ", Model: " + comp.getModel());
        }
    }


}

public class ComputerDriver {
    public static void main(String[] args) {
        Computer computer = new Computer("APPLE", "MAC-AIR-M5");
        Person person1 = new Person("SALEH ABDULLA", computer);

        // PREVENT REDUNDANT EXAMPLE
        person1.buyComputer(computer);

        // This is a solution of c. Print the owner name and make and model of his computer. Access all of this information through the person1 object.
        // before adding the ArrayList

//        System.out.println("The owner's name is: " + person1.getComputer().getOwner().getFullName());
//        System.out.print(person1.getComputer().getMake());
//        System.out.println(" " + person1.getComputer().getModel());

        // instead now we will create a loop to print all the info of the computer in the arrayList
        person1.printComputersInfo();

        System.out.println("-".repeat(20));

        Person person2 = new Person("HUSSAIN AL-ASKARI");

//        person2.setBorrowedComputer(computer);
//        System.out.println("The owner's name is: " + person2.getBorrowedComputer().getOwner().getFullName());
//        System.out.println(person2.getFullName() + " " + person2.getBorrowedComputer().getMake() + " " + person2.getBorrowedComputer().getModel());
//

        // NEW PURCHASED COMPUTERS BY SALEH ABDULLA

        person2.borrowComputer(computer);
        person2.printBorrowedComputersInfo();

        // .g) In the main method create 2 more computer objects
        // and call the buyComputer() method of the ‘person1’ object to allow them to buy the two computers.
        // Print all of person1’s computers.

        System.out.println("-".repeat(20));
        Computer macBookPro = new Computer("APPLE", "MACBOOK-Pro");
        Computer iPhone17 = new Computer("APPLE", "IPHONE-17");

        person1.buyComputer(macBookPro);
        person1.buyComputer(iPhone17);
        person1.printComputersInfo();





    }
}
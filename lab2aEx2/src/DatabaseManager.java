public class DatabaseManager {

    public static void main(String[] args) {

        Employee me = new Employee("hussain", "Al-askari", 202300064, "Manager");
        Employee someGuy = new Employee();

        someGuy.setFirstName("Ali");
        someGuy.setIdNumber(-444);

        System.out.println(someGuy.getFirstName());
        System.out.println(someGuy.getIdNumber());
//
//        System.out.println("-".repeat(20));
//
//        System.out.println("Employee first name: " + me.getFirstName());
//        System.out.println("Employee last name: " + me.getLastName());
//        System.out.println("Id number: " + me.getIdNumber());
//        System.out.println("Position: " + me.getPosition());




    }

}

import java.sql.SQLOutput;

public class DatabaseManager {

    public static void main(String[] args) {

        Car camry = new Car("TOYOTA", "CAMRY", "WHITE", "2026");

        Employee me = new Employee("Hussain", "Al-askari", 202300064, "Manager");

        me.setCar(camry);

        me.getCar().printCarInfo();

        System.out.println("-".repeat(20));

        System.out.println(camry.getOwner().toString());






//        Employee someGuy = new Employee();

//        someGuy.setFirstName("Ali");
//        someGuy.setIdNumber(-444);
//
//        System.out.println(someGuy.getFirstName());
//        System.out.println(someGuy.getIdNumber());
//
//        System.out.println("-".repeat(20));
//
//        System.out.println("Employee first name: " + me.getFirstName());
//        System.out.println("Employee last name: " + me.getLastName());
//        System.out.println("Id number: " + me.getIdNumber());
//        System.out.println("Position: " + me.getPosition());




    }

}

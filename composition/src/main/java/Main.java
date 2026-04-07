import javax.management.monitor.Monitor;
import java.security.Key;

public class Main {
    public static void main(String[] args) {
        // 1 - 0..*             // 1 - * then we need to change the constructor
        Person hussain = new Person("HUSSAIN", "AL-ASKARI", 21);
        Iphone iphone17 = new Iphone("IPHONE 17 PRO MAX", "APPLE", "17 PRO MAX", "2025");

        // --------- Aggregation example

        // What's the difference between Aggregation and Composition?
           // Aggregation: weak relationship, can be ignored and computer still exits > not highlighted
          //  Composition: Strong relationship, cannot be ignored, and without it computer will not be exists! > highlighted

        Monitor monitor = new Monitor() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        Keyboard keyboard = new Keyboard();
        Camera camera = new Camera();
        Mouse mouse = new Mouse();

        Computer computer = new Computer("MAC AIR", "AIR M2", "AIR", "2026", monitor, keyboard, mouse, camera);
        hussain.buyDevice(computer);

        // -------------------------

        hussain.buyDevice(iphone17);

        // through hussain object
        for (Device dev: hussain.getDeviceArrayList()) {
            System.out.println(dev.getName());
        }

        // through the iPhone
//        System.out.println(iphone17.getOwnerPerson().getFirstName()+  " " + iphone17.getOwnerPerson().getLastName());

    }
}

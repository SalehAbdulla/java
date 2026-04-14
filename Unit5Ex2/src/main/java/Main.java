public class Main {
    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus("Pegasus", 18, "male", "horse", "white", 12);
        pegasus.eat();
        pegasus.sleep();
        pegasus.move();

        System.out.println("-".repeat(20));

        Superman superman = new Superman();
        superman.fly();
        superman.setTransformed(true);
        superman.fly();
    }
}

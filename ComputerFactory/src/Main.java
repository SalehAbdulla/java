public class Main {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208", "Asus", "240");
        Monitor monitor = new Monitor("27inches beast", "Acer", 27, "2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer personalComputer = new PersonalComputer("2025", "Asus",
                computerCase, monitor, motherboard);

//        personalComputer.getComputerCase().pressPowerButton();
//        personalComputer.getMonitor().drawPixelAt(10, 10, "red");
//        personalComputer.getMotherboard().loadProgram("IntelliJ");

        personalComputer.powerUp();


    }
}
public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27inch beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                monitor, theMotherboard, theCase);
//
//        thePC.getMotherboard().loadProgram("Windows");
//        thePC.getMonitor().drawAPixel(10,10,"red");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
        thePC.runProgram("Windows");
    }
}

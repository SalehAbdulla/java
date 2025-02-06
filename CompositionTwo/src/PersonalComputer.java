class PersonalComputer extends Product {

    // init classes as an object
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor,
                            Motherboard motherboard,ComputerCase computerCase){
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    private void drawLogo(){
        monitor.drawAPixel(1200, 50, "yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

    public void runProgram(String programName){
        motherboard.loadProgram(programName);
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase(){
//        return computerCase;
//    }

}
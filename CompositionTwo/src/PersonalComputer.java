class PersonalComputer extends Product {

    // init classes as an object
    private Monitor monitor;
    private PersonalComputer personalComputer;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, PersonalComputer personalComputer,
                            Motherboard motherboard,ComputerCase computerCase){
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.personalComputer = personalComputer;
    }

}
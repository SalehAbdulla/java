public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox){
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater(){
        //brewMaster.setHasWorkToDo(true);
        brewMaster.brewCoffee();
    }

    public void pourMilk(){
        //iceBox.setHasWorkToDo(true);
        iceBox.orderFood();
    }

    public void loadDishwasher(){
        //dishWasher.setHasWorkToDo(true);
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean setCoffeeMakerState, boolean setDishWasherState, boolean setRefrigeratorState){
        brewMaster.setHasWorkToDo(setCoffeeMakerState);
        dishWasher.setHasWorkToDo(setDishWasherState);
        iceBox.setHasWorkToDo(setRefrigeratorState);
    }

}

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public SmartKitchen(CoffeeMaker brewMaster, Refrigerator iceBox, DishWasher dishWasher){
        this.brewMaster = brewMaster;
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
    }

    public CoffeeMaker getBrewMaster(){
        return brewMaster;
    }

    public Refrigerator getIceBox(){
        return iceBox;
    }

    public DishWasher getDishWasher(){
        return dishWasher;
    }

    public void setKitchenState(boolean setCoffeeMakerState, boolean setRefrigeratorState, boolean setDishWasherState){

        getBrewMaster().setHasWorkToDo(setCoffeeMakerState);
        getIceBox().setHasWorkToDo(setRefrigeratorState);
        getDishWasher().setHasWorkToDo(setDishWasherState);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){ System.out.println("Brewing Coffee"); hasWorkToDo = false; }
    }
}


class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){ System.out.println("Ordering Food"); hasWorkToDo = false; }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){ System.out.println("Washing Dishes"); hasWorkToDo = false; }
    }
}
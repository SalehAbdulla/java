public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    private void addWater() {
        System.out.println("water added to Refrigerator");
        iceBox.setHasWorkToDo(true);
    }

    private void pourMilk(){
        System.out.println("pouring Milk to brew master");
        brewMaster.setHasWorkToDo(true);
    }

    private void loadDishWasher() {
        System.out.println("dish washer is loading");
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean brewMasterState, boolean dishWasherState, boolean iceBoxState) {
        brewMaster.setHasWorkToDo(brewMasterState);
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(iceBoxState);
    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishWasher();
        setKitchenState(false, false, false);
    }


}

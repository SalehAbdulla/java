public class DishWasher {
    private boolean HasWorkToDo;

    public boolean isHasWorkToDo() {
        return HasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        HasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        this.HasWorkToDo = true;
        System.out.println("doDishes executed, dishes being cleaning...");
    }
}

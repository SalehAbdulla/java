public class Superman extends Human implements Flying {
    private boolean isTransformed;

    public Superman() {
        super("Clark", 28, "male", "Kent", "journalist");
        this.isTransformed = false;
    }

    public void Transform(){
        String message = isTransformed ? "superman change clothing from journalist suit to superman suit"
                : "superman change clothing from superman suit to journalist suit";
        System.out.println(message);
    }

    @Override
    public void fly(){
        String message = isTransformed ? "Superman is flying! Beware Lex Luthor!" : "Shhhhh! I am Clark Kent now, don’t want to reveal my secret ID";
        System.out.println(message);
        if (!isTransformed) move();
    }

    public boolean isTransformed() {
        return isTransformed;
    }

    public void setTransformed(boolean transformed) {
        isTransformed = transformed;
    }
}

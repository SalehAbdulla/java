public class Dog extends Animal{

    private String earShape;
    private String tailShape;


    public Dog(){
        super("Dog", "small", 23);
    }

    public Dog(String type, double weight){
        this(type, weight, "Curly ear shape", "straight tail shape");
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, (weight < 15 ? "small" : weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    public void makeNoise(){

        if (type == "wolf"){
            System.out.print("Ow Woooooo! ");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("This is an overridden 'extend': Dog also, run, walk and wag their tail. ");
        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();

    }

    private void bark(){
        System.out.print("Dog is barking ..");
    }

    private void run(){
        System.out.print("Dog is running ..");
    }

    private void walk(){
        System.out.print("Dog is walking ..");
    }

    private void wagTail(){
        System.out.print("Dog is wagging tail ..");
    }


}
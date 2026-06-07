public class Me extends Person{

    public Me(String firstname) {
        super(firstname);
    };

    @Override
    public void walk() {
        System.out.println("I'm Walking");
    }

    public String walk(String firstname){
        System.out.println(firstname + " is moving");
        return "";
    }
}

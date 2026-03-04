public class Friend {
    private String name;
    private int age;
    private double height;

    public Friend(){
        this.name = "default";
        this.age = 0;
        this.height = 0.0;
    }

    public Friend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void saySomething(String thingToSay){
        System.out.println(this.name + " " + thingToSay);
    }

    public void grow(double howMuch) {
        System.out.println(this.name + "'s new height " + this.height + howMuch);
    }

}

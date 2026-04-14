public class Human extends Mammal {
    private String surname;
    private String occupation;

    public Human(String name, int age, String gender, String surname, String occupation) {
        super(name, age, gender);
        this.surname = surname;
        this.occupation = occupation;
    }

    @Override
    public void eat() {
        System.out.println(this.surname + " is eating...");
    }

    @Override
    public void sleep() {
        System.out.println(this.surname + " is sleeping...");
    }

    @Override
    public void move() {
        System.out.println(this.surname + " is moving...");
    }

    @Override
    public void speak() {
        System.out.println(this.surname + " is speaking...");
    }
}

@VeryImportant
public class Cat {

    @ImportantString
    public String name;

    private int age;

    public Cat(){
        this("unknown", 0);
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediately(times = 10)
    public void meow() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Munch");
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
}

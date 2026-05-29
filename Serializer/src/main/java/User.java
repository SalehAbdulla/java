import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public int age;

    public void sayHello(){
        System.out.println("Hi I'm " + this.name + ", welcome to jave serialization");
    }
}

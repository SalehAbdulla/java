import java.io.Serializable;

public class Person implements Serializable {
    String firstname;
    String lastname;
    transient int age;


    public void printMyInfo(){
        System.out.println("my name is: "+ firstname +" " + lastname);
        System.out.println("I'm " + age + " years old.");
    }

}

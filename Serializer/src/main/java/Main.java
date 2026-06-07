import java.io.*;

public class Main{
    public static void main(String[] args) {
        User me = new User();
        me.name = "SALEH ABDULLA";
        me.age = 27;

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("./src/main/java/UserInfo.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(me);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println("error occur: " + e.getMessage());
        }

        System.out.println("object info saved!");

    }
}

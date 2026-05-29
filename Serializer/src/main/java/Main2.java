import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fileInputStream = new FileInputStream("./src/main/java/UserInfo.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        user = (User) objectInputStream.readObject();

        System.out.println("From deserialization, my name is " + user.name);
        System.out.println("From deserialization, my age is " + user.age);

        fileInputStream.close();
        objectInputStream.close();

    }
}

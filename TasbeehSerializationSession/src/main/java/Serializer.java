import java.io.*;

public class Serializer {

    // Low level Stream for output
    // High level Object Stream for output

    public static void serializeObject(Person person) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./src/main/java/tasbeeh.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);

        objectOutputStream.close();
    }

    // Low level Stream for input
    // High level Object Stream for input

    public static Person deSerializeObject() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("./src/main/java/tasbeeh.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person tasbeeh = (Person) objectInputStream.readObject();

        objectInputStream.close();

        return tasbeeh;

    }




}

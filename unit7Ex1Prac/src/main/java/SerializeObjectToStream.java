import java.io.*;

public class SerializeObjectToStream {

    public static void main(String[] args) {
        Customer aCustomer = new Customer();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(ReadAndWriteExample.filePath));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(aCustomer); // serializes

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}

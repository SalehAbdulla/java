import java.io.*;
import java.util.Scanner;

public class ReadAndWriteExample {
    static File fileObject = new File("./src/main/java/myFile.txt"); // Low-level object
    public static final String filePath = "./src/main/java/myFile.txt";

    public static void main(String[] args) {
//        readFile();
//        System.out.println("\n-".repeat(20));
//        overWrite();
//        System.out.println("\n-".repeat(20));
//        readFile();
//        System.out.println("\n-".repeat(20));
//        appendWrite();
        writeToAFileUsingPrintStream();
        //readFile(); // FileInputStream
        readFileDemo(); // Scanner

    }

    // Read from a file
    public static void readFile() {
        int line;

        try {
            FileInputStream fis = new FileInputStream(fileObject);
            while ((line = fis.read()) != -1) {
                System.out.print((char) line);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("error occur: " + e.getMessage());
        }

    }

    // overWrite to a file
    public static void overWrite() {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fileObject);
            String message = "This is new message that will overwrite the previous text";
            fos.write((byte[]) message.getBytes());
            fos.close();
        } catch (Exception e) {
            System.out.println("caught error: " + e.getMessage());
        }

    }


    // overWrite to a file
    public static void appendWrite() {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fileObject, true); // this is to append EOF
            String message = "\nThis is new message that will overwrite the previous text";
            fos.write((byte[]) message.getBytes());
            fos.close();
        } catch (Exception e) {
            System.out.println("caught error: " + e.getMessage());
        }

    }

    // -- Writing to a text file using PrintStream
    // To create a PrintStream that writes into a file,
    // we can do either of the following
        // PrintStream outFile = new PrintStream(new File(path));
        // outFile = PrintStream(new FileOutputStream(new File(path));

    public static void writeToAFileUsingPrintStream(){
        PrintStream printStream;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);// appending set to true

            printStream = new PrintStream(fileOutputStream);

            String message = "Lets get this done";
            printStream.println(message);

            printStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Completed");
        }

    }

    public static void readFileDemo(){
        try {
            Scanner scanner = new Scanner(fileObject);
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("caught an error: " + e.getMessage());
        }
    }


}

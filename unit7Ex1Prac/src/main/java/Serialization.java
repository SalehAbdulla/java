import java.io.*;

public class Serialization {


    public static void main(String[] args) {
//        File newFile = new File("./myFile.txt");
//        if (newFile.isFile() && newFile.canWrite() && newFile.canRead()) {
//            System.out.println("file exists and ready to use");
//        } else {
//            System.out.println("file no good for purpose");
//        }
//
//        listADirectory("./src/main/java");

        byteStream();


    }

    public static void listADirectory(String dirName) {
        File dirList = new File(dirName);
        String[] dList = dirList.list();

        for (int i = 0; i < dList.length; i++) {
            System.out.println(dList[i]);
        }

    }


    public static void byteStream(){
        // Low level stream
        File fileObject = new File("./src/main/java/myFile.txt");
        FileOutputStream fos;
        FilterOutputStream filterOut;

        try {
            // HighLevel stream passed an object of a low-level stream
            fos = new FileOutputStream(fileObject);
            String myMessage = "This is my Message\nHello World!";

            try {
                fos.write(myMessage.getBytes());
                fos.close();
            } catch (IOException e) {
                System.out.println("error occur: " + e.getMessage());
            }

            FileInputStream fis;
            int data;

            try {
                fis = new FileInputStream(fileObject);
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data);
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Caught error: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("catch an error: " + e.getMessage());
        }



    }




}

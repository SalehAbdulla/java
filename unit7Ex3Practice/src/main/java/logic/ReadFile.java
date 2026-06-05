package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private String content;

    public ReadFile(File fileToRead) {
        // takes the data from existed file, and save it into content attribute
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + "\n";
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            System.out.println("cannot find file");
        }

    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}

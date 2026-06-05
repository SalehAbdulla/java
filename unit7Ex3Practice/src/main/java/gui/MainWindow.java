package gui;

import logic.ReadFile;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainWindow extends JFrame {
    // Components
    File file = new File("./src/main/resources/data.txt");
    ReadFile readFile = new ReadFile(file);

    public MainWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("A File Reader");
        setSize(new Dimension(400, 400));
        setVisible(true);
    }
}

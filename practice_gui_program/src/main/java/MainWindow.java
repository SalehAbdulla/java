import javax.swing.*;
import java.awt.*;
// THIS IS A BASIC EXAMPLE OF HOW JFRAME WORKS
public class MainWindow extends JFrame {

    JLabel title = new JLabel("Welcome to GUI learning program");
    JButton okBtn = new JButton("OK");
    JButton cancel = new JButton("CANCEL");


    public MainWindow() {
        setTitle("This is a practice Frame for GUI PROGRAM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new FlowLayout());


        add(title);
        add(okBtn);
        add(cancel);


        setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class Example1UsingBorderLayout extends JFrame {

    // Panal
    private JPanel jPnl;
    // welcome to java field
    private JTextField jTxtField;
    // an Array of buttons
    private JButton[] jBtns;

    public Example1UsingBorderLayout(){
        super("Testing with JPanal with the use of BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPnl = new JPanel();
        jPnl.setLayout(new BorderLayout());

        // North
        jTxtField = new JTextField("Welcome to java");
        jPnl.add(jTxtField, BorderLayout.NORTH);

        // SouthWelcome to java
        JPanel btnsPanal = new JPanel();
        jBtns = new JButton[5];

        btnsPanal.setLayout(new FlowLayout());
        // OR New GridLayout(1, jBtns.length) 1 row and length of array as number of columns
        for (int i = 0; i < jBtns.length; i++) {
            jBtns[i] = new JButton("Button" + (i+1));
            btnsPanal.add(jBtns[i]);
        }

        jPnl.add(btnsPanal, BorderLayout.SOUTH);
        add(jPnl);
        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Example1UsingBorderLayout();
    }
}



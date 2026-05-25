import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECField;

public class Example2RespondingToABtnClicked extends JFrame {

    private JButton exitButton = new JButton("Exit");
    private TheListener theListener = new TheListener();

    public Example2RespondingToABtnClicked(){
        super("This is a testing for event handling");
        exitButton.addActionListener(theListener);

        setLayout(new GridLayout());

        add(exitButton);
        setSize(420, 420);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Example2RespondingToABtnClicked();
    }
}


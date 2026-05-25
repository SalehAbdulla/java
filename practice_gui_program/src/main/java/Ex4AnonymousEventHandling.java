import javax.swing.*;
import java.awt.*;

public class Ex4AnonymousEventHandling extends JFrame {

    // Panels
    JPanel jPnl = new JPanel();
    // Component
    JButton jBtn = new JButton("Say Hello!");


    public Ex4AnonymousEventHandling(){
        super("I'm The One");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPnl.setLayout(new BorderLayout());

        jBtn.addActionListener(e -> {
            System.out.println("Stop Clicking me! 😭");
        });

        jPnl.add(jBtn, BorderLayout.CENTER);

        add(jPnl);
        setSize(420, 420);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Ex4AnonymousEventHandling();
    }
}

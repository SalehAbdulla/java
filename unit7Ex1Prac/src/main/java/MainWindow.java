import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    JLabel jLbl = new JLabel("Declare and Throw Exception");
    JLabel radiusLbl = new JLabel("Radius");
    JTextField jTextField = new JTextField(15);
    JButton jBtn = new JButton("Create Circle");

    Circle circle = new Circle();


    public MainWindow(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel jPnl = new JPanel();
        jPnl.setLayout(new BorderLayout()); // BorderLayout, CENTER, WEST, EAST, NORTH, SOUTH
        jLbl.setHorizontalAlignment(SwingConstants.CENTER); // align it to center
        jLbl.setBorder(new EmptyBorder(10, 0,0,0)); // mt-10
        jLbl.setFont(new Font("Arial", Font.BOLD, 18)); // Style it
        jPnl.add(jLbl, BorderLayout.NORTH); // place it to the top

        JPanel firstRowPnl = new JPanel();
        firstRowPnl.setBorder(new EmptyBorder(50, 0,0,0));
        firstRowPnl.setLayout(new FlowLayout()); // Left to Right

        firstRowPnl.add(radiusLbl);
        firstRowPnl.add(jTextField);
        jPnl.add(firstRowPnl, BorderLayout.CENTER);


        // --> Btn
        jBtn.setBorder(new EmptyBorder(0, 0, 50, 0));
        jBtn.setForeground(new Color(200, 1, 1));
        jBtn.addActionListener(this);
        jPnl.add(jBtn, BorderLayout.SOUTH);



        add(jPnl);
        setSize(new Dimension(440, 240));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jBtn) {
            try {
                double getUserRadius = Double.parseDouble(jTextField.getText());
                circle.setRadius(getUserRadius);
                JOptionPane.showMessageDialog(this, "Radius set successfully.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please enter a positive number");
            }
        }
    }
}

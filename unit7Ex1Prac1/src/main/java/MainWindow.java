import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    JLabel jLabel = new JLabel("Declare and Throw Exception", SwingConstants.CENTER);
    JLabel radiusLbl = new JLabel("Radius:", SwingConstants.CENTER);
    JTextField jTextField = new JTextField(12);
    JButton jButton = new JButton("Create Circle");

    Circle circle;


    public MainWindow(){
        super("Solving Unit 7 Ex 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // -- MAIN PANEL
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jLabel.setBorder(new EmptyBorder(15, 0,0,0));
        jLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel.add(jLabel, BorderLayout.NORTH);

        // ---- SUB PANEL
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BorderLayout());

        JPanel div = new JPanel();
        div.setBorder(new EmptyBorder(15, 0,0,0));
        div.add(radiusLbl);
        div.add(jTextField);
        subPanel.add(div, BorderLayout.NORTH);

        JPanel jBtnPnl = new JPanel();
        jBtnPnl.setLayout(new FlowLayout());
        jBtnPnl.add(jButton, BorderLayout.CENTER);
        subPanel.add(jBtnPnl, BorderLayout.CENTER);

        jButton.addActionListener(this);


        jPanel.add(subPanel, BorderLayout.CENTER);
        add(jPanel);
        setSize(new Dimension(420, 420));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            try {
                double getUserInput = (Double) Double.parseDouble(jTextField.getText());
                circle = new Circle();
                circle.setRadis(getUserInput);
                JOptionPane.showMessageDialog(null, "Circle Created", "Successful", JOptionPane.PLAIN_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "your input must be a number", "Invalid input", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException exception) {
                JOptionPane.showMessageDialog(null, "your input must be a positve number", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

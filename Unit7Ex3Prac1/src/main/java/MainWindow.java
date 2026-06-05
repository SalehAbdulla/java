import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    Division division;

    JLabel headerLbl = new JLabel("Handling Exceptions Thrown by the JVM", SwingConstants.CENTER);

    JLabel numeratorLbl = new JLabel("Numerator:", SwingConstants.CENTER);
    JTextField numeratorField = new JTextField(12);

    JLabel denominatorLbl = new JLabel("Denominator:", SwingConstants.CENTER);
    JTextField denominatorField = new JTextField(12);

    JLabel resultLbl = new JLabel("Result:", SwingConstants.CENTER);
    JTextField resultField = new JTextField(12);
    JButton divideBtn =  new JButton("divide");

    public MainWindow(){
        super("Unit 7 Ex3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        headerLbl.setFont(new Font("Arial", Font.BOLD, 16));
        headerLbl.setBorder(new EmptyBorder(20, 0,0,0));
        mainPanel.add(headerLbl, BorderLayout.NORTH);

        JPanel section = new JPanel();
        section.setLayout(new GridLayout(3, 1, 0, 10));

        JPanel pnl1 = new JPanel();
        pnl1.add(numeratorLbl);
        pnl1.add(numeratorField);
        section.add(pnl1);

        JPanel pnl2 = new JPanel();
        pnl2.add(denominatorLbl);
        pnl2.add(denominatorField);
        section.add(pnl2);

        JPanel pnl3 = new JPanel();
        pnl3.add(resultLbl);
        resultField.setEditable(false);
        pnl3.add(resultField);
        divideBtn.addActionListener(this);
        pnl3.add(divideBtn);
        section.add(pnl3);

        JPanel wrapper = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));
        wrapper.add(section);

        mainPanel.add(wrapper, BorderLayout.CENTER);

        add(mainPanel);
        setSize(new Dimension(420, 420));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == divideBtn) {
            try {

                double firstNum = Double.parseDouble(numeratorField.getText());
                double secondNum = Double.parseDouble(denominatorField.getText());
                division = new Division(firstNum, secondNum);
                double res = division.divide(firstNum, secondNum);
                resultField.setText(String.valueOf(res));

            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }

        }
    }
}

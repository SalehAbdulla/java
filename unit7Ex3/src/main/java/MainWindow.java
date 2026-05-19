import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {

        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel panel = new JPanel(new GridBagLayout());

        // Constraints object
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        JLabel titleLabel = new JLabel("Handling Exceptions thrown by the JVM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;

        panel.add(titleLabel, gbc);

        JLabel subTitleLabel =
                new JLabel("Please enter 2 integer numbers to divide:");

        subTitleLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;

        panel.add(subTitleLabel, gbc);

        JLabel numeratorLabel = new JLabel("Numerator:");
        numeratorLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;

        panel.add(numeratorLabel, gbc);

        JTextField numeratorField = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 2;

        panel.add(numeratorField, gbc);

        JLabel denominatorLabel = new JLabel("Denominator:");
        denominatorLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridx = 0;
        gbc.gridy = 3;

        panel.add(denominatorLabel, gbc);

        JTextField denominatorField = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 3;

        panel.add(denominatorField, gbc);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridx = 0;
        gbc.gridy = 4;

        panel.add(resultLabel, gbc);

        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        gbc.gridx = 1;
        gbc.gridy = 4;

        panel.add(resultField, gbc);

        JButton divideButton = new JButton("Divide");

        gbc.gridx = 2;
        gbc.gridy = 4;

        panel.add(divideButton, gbc);

        divideButton.addActionListener(e -> {

            try {

                int num = Integer.parseInt(numeratorField.getText());
                int den = Integer.parseInt(denominatorField.getText());

                int result = num / den;

                resultField.setText(String.valueOf(result));

            } catch (ArithmeticException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Cannot divide by zero!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter valid integers!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

        add(panel);

        setVisible(true);
    }

}
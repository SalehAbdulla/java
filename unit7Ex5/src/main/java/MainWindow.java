import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Employee Serialization System");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Employee Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);

        // Add Employee button
        JButton addEmployeeBtn = new JButton("Add & Serialize Employee");
        gbc.gridy = 1;
        panel.add(addEmployeeBtn, gbc);

        // Display Employee button
        JButton displayEmployeeBtn = new JButton("Deserialize & Display Employees");
        gbc.gridy = 2;
        panel.add(displayEmployeeBtn, gbc);

        // Exit button
        JButton exitBtn = new JButton("Exit");
        gbc.gridy = 3;
        panel.add(exitBtn, gbc);

        // Action listeners
        addEmployeeBtn.addActionListener(e -> {
            new ReadInfoSerialize().setVisible(true);
        });

        displayEmployeeBtn.addActionListener(e -> {
            new DeserializeDisplay().setVisible(true);
        });

        exitBtn.addActionListener(e -> System.exit(0));

        add(panel);
        setVisible(true);
    }


}

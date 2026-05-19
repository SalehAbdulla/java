import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class ReadInfoSerialize extends JFrame {

    private JTextField firstNameField;
    private JTextField familyNameField;
    private JTextField addressField;
    private JTextField phoneField;
    private ArrayList<Employee> employees;

    public ReadInfoSerialize() {
        setTitle("Add Employee Information");
        setSize(450, 350);
        setLocationRelativeTo(null);

        employees = new ArrayList<>();

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Employee Information");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        gbc.gridwidth = 1;

        // First Name
        JLabel firstNameLabel = new JLabel("First Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(firstNameLabel, gbc);

        firstNameField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(firstNameField, gbc);

        // Family Name
        JLabel familyNameLabel = new JLabel("Family Name:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(familyNameLabel, gbc);

        familyNameField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(familyNameField, gbc);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(addressLabel, gbc);

        addressField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(addressField, gbc);

        // Phone
        JLabel phoneLabel = new JLabel("Phone Number:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(phoneLabel, gbc);

        phoneField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(phoneField, gbc);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton storeBtn = new JButton("Store Customer Info");
        JButton serializeBtn = new JButton("Serialize");
        JButton closeBtn = new JButton("Close");

        buttonPanel.add(storeBtn);
        buttonPanel.add(serializeBtn);
        buttonPanel.add(closeBtn);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        // Action listeners
        storeBtn.addActionListener(e -> storeEmployee());
        serializeBtn.addActionListener(e -> serializeEmployees());
        closeBtn.addActionListener(e -> dispose());

        add(panel);
    }

    private void storeEmployee() {
        String firstName = firstNameField.getText().trim();
        String familyName = familyNameField.getText().trim();
        String address = addressField.getText().trim();
        String phone = phoneField.getText().trim();

        if (firstName.isEmpty() || familyName.isEmpty() ||
                address.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill all fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Employee emp = new Employee(firstName, familyName, address, phone);
        employees.add(emp);

        JOptionPane.showMessageDialog(this,
                "Employee added successfully!\nTotal employees: " + employees.size(),
                "Success",
                JOptionPane.INFORMATION_MESSAGE);

        // Clear fields
        firstNameField.setText("");
        familyNameField.setText("");
        addressField.setText("");
        phoneField.setText("");

        firstNameField.requestFocus();
    }

    private void serializeEmployees() {
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No employees to serialize!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (FileOutputStream fos = new FileOutputStream("employees.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employees);

            JOptionPane.showMessageDialog(this,
                    "Employees serialized successfully!\n" +
                            employees.size() + " employee(s) saved to employees.dat",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error serializing employees:\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

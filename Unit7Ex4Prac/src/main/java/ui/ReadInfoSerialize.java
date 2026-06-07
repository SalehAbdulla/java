package ui;

import model.Employee;
import logic.Serializer;
import ui.components.UIComponents;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReadInfoSerialize extends JFrame implements ActionListener {

    Serializer serializer;


    // Components | left side
    JLabel EmployeeInfoLbl = UIComponents.createHeader("Employee Information");

    JLabel firstNameLbl = UIComponents.createSubHeader("firstname:");
    JTextField firstNameField = UIComponents.createTextField(12);

    JLabel lastNameLbl = UIComponents.createSubHeader("lastname:");
    JTextField lastNameField = UIComponents.createTextField(12);

    JLabel addressLbl = UIComponents.createSubHeader("address:");
    JTextField addressField = UIComponents.createTextField(12);

    JLabel phoneLbl = UIComponents.createSubHeader("phone:");
    JTextField phoneField = UIComponents.createTextField(12);


    // Right side
    JButton storeInfoBtn = UIComponents.createPrimaryButton("Store Customer Info");
    JButton serialiseBtn = UIComponents.createSecondaryButton("Serialize");
    JButton closeBtn = UIComponents.createSecondaryButton("Close");

    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    Employee employee= new Employee();

    public ReadInfoSerialize(Serializer serializer){
        super("Write your info");
        this.serializer = serializer;
        JPanel mainPnl = new JPanel(new BorderLayout());
        mainPnl.setBorder(new EmptyBorder(10,10,10,10));

        EmployeeInfoLbl.setHorizontalAlignment(SwingConstants.LEFT);
        mainPnl.add(EmployeeInfoLbl, BorderLayout.NORTH);

        JPanel bodyGrid = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Global Rule
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        // FirstName row
        gbc.gridy = 0;
        gbc.gridx = 0; bodyGrid.add(firstNameLbl, gbc);
        gbc.gridx = 1; bodyGrid.add(firstNameField, gbc);

        // Lastname row
        gbc.gridy = 2;
        gbc.gridx = 0; bodyGrid.add(lastNameLbl, gbc);
        gbc.gridx = 1; bodyGrid.add(lastNameField, gbc);

        // Address row
        gbc.gridy = 3;
        gbc.gridx = 0; bodyGrid.add(addressLbl, gbc);
        gbc.gridx = 1; bodyGrid.add(addressField, gbc);

        // Phone row
        gbc.gridy = 4;
        gbc.gridx = 0; bodyGrid.add(phoneLbl, gbc);
        gbc.gridx = 1; bodyGrid.add(phoneField, gbc);

        // StoreCustomerInfo row
        gbc.gridx = 2;
        storeInfoBtn.addActionListener(this);
        bodyGrid.add(storeInfoBtn, gbc);

        gbc.gridy = 5;
        gbc.gridx = 2; // Keep them on the right side column

        JPanel bottomActionGroup = new JPanel(new GridLayout(1, 2, 10, 0));
        serialiseBtn.addActionListener(this);
        closeBtn.addActionListener(this);

        bottomActionGroup.add(serialiseBtn);
        bottomActionGroup.add(closeBtn);

        bodyGrid.add(bottomActionGroup, gbc);

        add(bodyGrid, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(820,420);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(storeInfoBtn)) {
            String getFirstname = firstNameField.getText();
            String getLastname = lastNameField.getText();
            String getAddress = addressField.getText();
            String getPhone = phoneField.getText();
            try {
                employee = new Employee(getFirstname, getLastname, getAddress, getPhone);
                JOptionPane.showMessageDialog(null, "employee with name " + getFirstname + " created successfully");
                employeeArrayList.add(employee);

                System.out.println("new employee added Successfully");


            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "error occur: " + ex.getMessage());
                ex.printStackTrace();
            }
        } else if (e.getSource().equals(serialiseBtn)) {
            // Serialization
            try {
                serializer.serializeObject(employeeArrayList);
                JOptionPane.showMessageDialog(null, "employee serialized successfully");
                firstNameField.setText("");
                lastNameField.setText("");
                addressField.setText("");
                phoneField.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                ex.printStackTrace();
            }

        } else if (e.getSource().equals(closeBtn)){
            this.dispose();
        }
    }


}

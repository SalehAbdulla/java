package GUI;

import Logic.CompRepairClub;
import Logic.Repair;
import javax.swing.*;
import java.awt.*;

public class AddRepairFrame extends JFrame {

    private CompRepairClub club;
    private JTextField txtMake, txtModel, txtName, txtPhone;
    private JTextArea txtProblem;

    public AddRepairFrame(CompRepairClub club) {
        this.club = club;

        setTitle("Add Repair Details");
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Add Repair Details");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 0, 255)); // Blue color
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        gbc.gridwidth = 1;

        // Make
        JLabel lblMake = new JLabel("Make :");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(lblMake, gbc);

        txtMake = new JTextField(20);
        gbc.gridx = 1;
        panel.add(txtMake, gbc);

        // Model
        JLabel lblModel = new JLabel("Model :");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lblModel, gbc);

        txtModel = new JTextField(20);
        gbc.gridx = 1;
        panel.add(txtModel, gbc);

        // Customer Name
        JLabel lblName = new JLabel("Customer Name :");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(lblName, gbc);

        txtName = new JTextField(20);
        gbc.gridx = 1;
        panel.add(txtName, gbc);

        // Customer Phone
        JLabel lblPhone = new JLabel("Phone :");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(lblPhone, gbc);

        txtPhone = new JTextField(20);
        gbc.gridx = 1;
        panel.add(txtPhone, gbc);

        // Problem Description
        JLabel lblProblem = new JLabel("Problem description :");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        panel.add(lblProblem, gbc);

        txtProblem = new JTextArea(5, 20);
        txtProblem.setLineWrap(true);
        txtProblem.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtProblem);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(scrollPane, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnSave = new JButton("Save");
        JButton btnClose = new JButton("Close");

        buttonPanel.add(btnSave);
        buttonPanel.add(btnClose);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonPanel, gbc);

        // Action listeners
        btnSave.addActionListener(e -> saveRepair());
        btnClose.addActionListener(e -> dispose());

        add(panel);
    }

    private void saveRepair() {
        String make = txtMake.getText().trim();
        String model = txtModel.getText().trim();
        String name = txtName.getText().trim();
        String phone = txtPhone.getText().trim();
        String problem = txtProblem.getText().trim();

        if (make.isEmpty() || model.isEmpty() || name.isEmpty() ||
                phone.isEmpty() || problem.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill all fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Repair repair = new Repair(problem, make, model, name, phone);
        club.addRepair(repair);

        JOptionPane.showMessageDialog(this,
                "Repair added successfully!\nRepair ID: " + repair.getRepairId(),
                "Success",
                JOptionPane.INFORMATION_MESSAGE);

        // Clear fields
        txtMake.setText("");
        txtModel.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtProblem.setText("");

        txtMake.requestFocus();
    }
}